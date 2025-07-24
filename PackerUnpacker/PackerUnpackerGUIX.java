import MarvellousPackerUnpacker.MarvellousUnpackerGUI;
import java.awt.event.*;
import javax.swing.*;

class GUI extends JFrame implements ActionListener
{
    public JFrame fobj;
    public JButton bobj;
    public JLabel file,Result;
    public JTextField fileText;

    public void GUIFrame()
    {
        fobj = new JFrame("Packer Unpacker Application");
        
        bobj = new JButton("Unpacked");
        bobj.setBounds(120,200,250,30);
        
        file = new JLabel("File Name : ");
        file.setBounds(80,120,120,36);
        fileText = new JTextField();
        fileText.setBounds(180,120,180,36);
    
        Result = new JLabel("");
        Result.setBounds(50,270,300,30);

        fobj.add(bobj);
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
        String FileName = fileText.getText(); 

        MarvellousUnpackerGUI mobj1 = new MarvellousUnpackerGUI(FileName);
        bRet = mobj1.UnpackingActivity();
        if(bRet == true)
        {
            Result.setText("Files Unpacked succesfully");
        }
        else 
        {
            Result.setText("Unable unpack files");
        }
        
    }
    
}
class PackerUnpackerGUIX
{
    public static void main(String A[])
    {
        GUI gobj = new GUI();

        gobj.GUIFrame();
    }
} 