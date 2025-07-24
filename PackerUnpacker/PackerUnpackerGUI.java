import MarvellousPackerUnpacker.MarvellousPackerGUI;
import java.awt.event.*;
import javax.swing.*;

class GUI extends JFrame implements ActionListener
{
    public JFrame fobj;
    public JButton bobj;
    public JLabel folder,file,Result;
    public JTextField folderText,fileText;

    public void GUIFrame()
    {
        fobj = new JFrame("Packer Unpacker Application");
        
        bobj = new JButton("Packed");
        bobj.setBounds(120,200,250,30);

        folder = new JLabel("Folder Name : ");
        folder.setBounds(80,60,120,36);
        folderText = new JTextField();
        folderText.setBounds(180,60,180,36);
        
        file = new JLabel("File Name : ");
        file.setBounds(80,120,120,36);
        fileText = new JTextField();
        fileText.setBounds(180,120,180,36);
    
        Result = new JLabel("");
        Result.setBounds(50,270,300,30);

        fobj.add(bobj);
        fobj.add(folderText);
        fobj.add(folder);
        fobj.add(fileText);
        fobj.add(file);
        fobj.add(Result);
        bobj.addActionListener(this);
        fobj.setSize(500,400);
        fobj.setLayout(null);
        fobj.setVisible(true);
        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
    }

    public void actionPerformed(ActionEvent aobj)
    {
        boolean bRet = false;
        String FolderName = folderText.getText();
        String FileName = fileText.getText(); 

        MarvellousPackerGUI mobj1 = new MarvellousPackerGUI(FileName, FolderName);
        bRet = mobj1.PackingActivity();
        if(bRet == true)
        {
            Result.setText("Files packed succesfully");
        }
        else 
        {
            Result.setText("Unable pack files");
        }
        
    }
    
}
class PackerUnpackerGUI
{
    public static void main(String A[])
    {
        GUI gobj = new GUI();

        gobj.GUIFrame();
    }
} 