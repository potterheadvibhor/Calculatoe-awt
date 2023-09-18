import java.awt.*;
import java.awt.event.*;
class fdemo extends Frame implements ActionListener
{  
    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,be,bd,bsum,bsub,bdid,bmul,bpercent,bxs,brem,bxr,bclr;
    TextField text1;
    Frame f;
    String z="";
    Double sum,num,sub,mul,did,percent,xs,rem,xr;
    Double z1;
    int check;
    double sq=1;
fdemo()
{
    setTitle("Calculator Awt");
    setLayout(null);
text1=new TextField();       
text1.setLocation(10,30);
text1.setBackground(Color.gray);

text1.setSize(230, 100);
add(text1);
b0=new Button("0");       //b0
b0.setLocation(10,131);
b0.setSize(40, 50);
add(b0);
b1=new Button("1");     //b1
b1.setLocation(51,131);
b1.setSize(40, 50);
add(b1);
b2=new Button("2");    ///b2
b2.setLocation(92,131);
b2.setSize(40, 50);
add(b2);
b3=new Button("3");      ////b3
b3.setLocation(133,131);
b3.setSize(40, 50);
add(b3);
bsum=new Button("+");     //bsumm
bsum.setLocation(174,131);
bsum.setSize(65, 50);
add(bsum);
b4=new Button("4");       ////b4
b4.setLocation(10,182);
b4.setSize(40, 50);
add(b4);
b5=new Button("5");     //b5
b5.setLocation(51,182);
b5.setSize(40, 50);
add(b5);
b6=new Button("6");    ///b6
b6.setLocation(92,182);
b6.setSize(40, 50);
add(b6);
b7=new Button("7");    ///b7
b7.setLocation(133,182);
b7.setSize(40, 50);
add(b7);
bsub=new Button("-");     ///bsub
bsub.setLocation(174,182);
bsub.setSize(65, 50);
add(bsub);
b8=new Button("8");       ////b8
b8.setLocation(10,233);
b8.setSize(40, 50);
add(b8);
b9=new Button("9");     //b9
b9.setLocation(51,233);
b9.setSize(40, 50);
add(b9);
be=new Button("=");    ///b00
be.setLocation(92,233);
be.setSize(40, 50);
add(be);
bd=new Button(".");    ///b000
bd.setLocation(133,233);
bd.setSize(40, 50);
add(bd);
bmul=new Button("*");        //BMUL
bmul.setLocation(174,233);
bmul.setSize(65, 50);
add(bmul);
bpercent=new Button("%");       ////b%
bpercent.setLocation(10,284);
bpercent.setSize(40, 50);
add(bpercent);
bxs=new Button("XS");     //bxs
bxs.setLocation(51,284);
bxs.setSize(40, 50);
add(bxs);
bxr=new Button("XR");    ///bxr
bxr.setLocation(92,284);
bxr.setSize(40, 50);
add(bxr);
bclr=new Button("CLR");    ///bclr
bclr.setLocation(133,284);
bclr.setSize(40, 50);
add(bclr);
bdid=new Button("/");        //B/
bdid.setLocation(174,284);
bdid.setSize(65, 50);
add(bdid);


b0.addActionListener(this);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
b7.addActionListener(this);
b8.addActionListener(this);
b9.addActionListener(this);
bsum.addActionListener(this);
bdid.addActionListener(this);
bpercent.addActionListener(this);
bxs.addActionListener(this);
//brem.addActionListener(this);
bxr.addActionListener(this);
bsub.addActionListener(this);
be.addActionListener(this);
bclr.addActionListener(this);
bmul.addActionListener(this);
setResizable(false);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b0)
{
    text1.setText("0");
    z=z+"0";
}
if(e.getSource()==b1)
{   z=z+"1";
    text1.setText(z);
   
}
if(e.getSource()==b2)
{
    z=z+"2";
    text1.setText(z);
}
if(e.getSource()==b3)
{
    z=z+"3";
    text1.setText(z);
}
if(e.getSource()==b4)
{
    z=z+"4";
    text1.setText(z);
}
if(e.getSource()==b5)
{
    z=z+"5";
    text1.setText(z);
}
if(e.getSource()==b6)
{
    z=z+"6";
    text1.setText(z);
}
if(e.getSource()==b7)
{
    z=z+"7";
    text1.setText(z);
}
if(e.getSource()==b8)
{
    z=z+"8";
    text1.setText(z);
}
if(e.getSource()==b9)
{
    z=z+"9";
    text1.setText(z);
}
if(e.getSource()==bsum)    //sum
{
    try{
z1=Double.parseDouble(z);
    }catch(Exception e1){System.out.println(e1);}
z="";
text1.setText("");
check=1;
}
if(e.getSource()==bsub)    //sub
{
    try{
z1=Double.parseDouble(z);
    }catch(Exception e1){System.out.println(e1);}
z="";
text1.setText("");
check=2;
}
if(e.getSource()==bmul)    //mul
{
    try{
z1=Double.parseDouble(z);
    }catch(Exception e1){System.out.println(e1);}
z="";
text1.setText("");
check=3;
}
if(e.getSource()==bdid)    //did
{
    try{
z1=Double.parseDouble(z);
    }catch(Exception e1){System.out.println(e1);}
z="";
text1.setText("");
check=4;
}
if(e.getSource()==bpercent)    //mul
{
    try{
z1=Double.parseDouble(z);
    }catch(Exception e1){System.out.println(e1);}
z="";
text1.setText("");
check=5;
}
if(e.getSource()==bxs)    //mul
{
    try{
z1=Double.parseDouble(z);
    }catch(Exception e1){System.out.println(e1);}
z="";
text1.setText("");
check=6;
}
if(e.getSource()==bxs)    //mul
{
    try{
z1=Double.parseDouble(z);
    }catch(Exception e1){System.out.println(e1);}
z="";
text1.setText("");
check=6;
}
if(e.getSource()==be)
{
    try{
        num=Double.parseDouble(z);
            }catch(Exception e1){System.out.println(e1);}
    if(check==1)
    {
    sum=z1+num;
    text1.setText(""+sum);
    }
    if(check==2)
    {
    sub=z1-num;
    text1.setText(""+sub);
    }
    if(check==3)
    {
    mul=z1*num;
    text1.setText(""+mul);
    }
    if(check==4)
    {
    did=z1/num;
    text1.setText(""+did);
    }
    if(check==5)
    {
        Double m=z1*100;
    percent=m/num;
    text1.setText(""+percent+"%");
    }
    if(check==6)
    {
        
        for(int i=1;i<=num;i++)
        {
            sq=z1*sq;
        }
        
    text1.setText(""+sq);
    }
}
if(e.getSource()==bclr)    //mul
{
    z1=0.0;
    num=0.0;
    check=0;
sq=0.0;
z="";
text1.setText("");
}


}

}

class calculatorawt
{
public static void main(String []args)
{
fdemo fd=new fdemo();
fd.setVisible(true);
fd.setLocation(400,200);
fd.setSize(250,345);
fd.addWindowListener(
    new WindowAdapter()
    {
        public void windowClosing(WindowEvent e)
        {
    System.exit(0);}});
    }}