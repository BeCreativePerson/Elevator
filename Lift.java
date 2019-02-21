import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Lift
{  static int arr[]={0,0,0,0,0,0,0,0,0,0,0};
static int brr[]={0,0,0,0,0,0,0,0,0,0,0};
static int crr[]={520,470,420,370,320,270,220,170,120,70,10};
static int u=0;
static int d=0;
static int n=520;
static int pos=0;
static int m=10;
  public static void main(String []args) throws Exception
  {int i,j,x,y,p,q;
    int z=0;
    u=0;
    d=0;
    int h;
    JFrame f=new JFrame();
    f.setLayout(null);
    f.setSize(700,700);
    f.setVisible(true);
    Button b1=new Button("1");
    Button b2=new Button("2");
    Button b3=new Button("3");
    Button b4=new Button("4");
    Button b5=new Button("5");
    Button b6=new Button("6");
    Button b7=new Button("7");
    Button b8=new Button("8");
    Button b9=new Button("9");
    Button b10=new Button("10");
    Button g=new Button("G");
    Button b11=new Button("^");
    Button b12=new Button("V");
    Button b13=new Button("<>");
    Button b14=new Button("><");
    Button b15=new Button("^");
    Button b16=new Button("V");
    Button b17=new Button("^");
    Button b18=new Button("V");
    Button b19=new Button("^");
    Button b20=new Button("V");
    Button b21=new Button("^");
    Button b22=new Button("V");
    Button b23=new Button("^");
    Button b24=new Button("V");
    Button b25=new Button("^");
    Button b26=new Button("V");
    Button b27=new Button("^");
    Button b28=new Button("V");
    Button b29=new Button("^");
    Button b30=new Button("V");
    Button b31=new Button("^");
    Button b32=new Button("V");
    Button b33=new Button("^");
    Button b34=new Button("V");
    Button b35=new Button("^");
    Button b36=new Button("V");
    JButton b=new JButton();
    Button bx=new Button();
    Button by=new Button();
    f.add(b);
    b.add(bx);
    b.add(by);
    bx.setVisible(true);
    by.setVisible(true);
    bx.setBounds(0,0,53,50);
    by.setBounds(50,0,50,50);
    bx.setBackground(Color.blue);
    by.setBackground(Color.blue);
    b.setBounds(120,520,100,50);
    b.setBackground(Color.red);
    b.setLayout(null);
    b.setVisible(true);
    b1.setVisible(true);
    b2.setVisible(true);
    b3.setVisible(true);
    b4.setVisible(true);
    b5.setVisible(true);
    b6.setVisible(true);
    b7.setVisible(true);
    b8.setVisible(true);
    b9.setVisible(true);
    b10.setVisible(true);
    b11.setVisible(true);
    b12.setVisible(true);
    b13.setVisible(true);
    b14.setVisible(true);
    b16.setVisible(true);
    b17.setVisible(true);
    b18.setVisible(true);
    b19.setVisible(true);
    b20.setVisible(true);
    b21.setVisible(true);
    b22.setVisible(true);
    b23.setVisible(true);
    b24.setVisible(true);
    b25.setVisible(true);
    b26.setVisible(true);
    b27.setVisible(true);
    b28.setVisible(true);
    b29.setVisible(true);
    b30.setVisible(true);
    b31.setVisible(true);
    b32.setVisible(true);
    b33.setVisible(true);
    b34.setVisible(true);
    b35.setVisible(true);
    g.setVisible(true);
    b1.setBounds(400,50,50,50);
    b2.setBounds(475,50,50,50);
    b3.setBounds(550,50,50,50);
    b4.setBounds(400,125,50,50);
    b5.setBounds(475,125,50,50);
    b6.setBounds(550,125,50,50);
    b7.setBounds(400,200,50,50);
    b8.setBounds(475,200,50,50);
    b9.setBounds(550,200,50,50);
    b10.setBounds(400,275,50,50);
    b11.setBounds(550,275,50,50);
    b12.setBounds(400,350,50,50);
    b13.setBounds(475,350,50,50);
    b14.setBounds(550,350,50,50);
    g.setBounds(475,275,50,50);

    b16.setBounds(70,20,30,30);
    b17.setBounds(20,70,30,30);
    b18.setBounds(70,70,30,30);
    b19.setBounds(20,120,30,30);
    b20.setBounds(70,120,30,30);
    b21.setBounds(20,170,30,30);
    b22.setBounds(70,170,30,30);
    b23.setBounds(20,220,30,30);
    b24.setBounds(70,220,30,30);
    b25.setBounds(20,270,30,30);
    b26.setBounds(70,270,30,30);
    b27.setBounds(20,320,30,30);
    b28.setBounds(70,320,30,30);
    b29.setBounds(20,370,30,30);
    b30.setBounds(70,370,30,30);
    b31.setBounds(20,420,30,30);
    b32.setBounds(70,420,30,30);
    b33.setBounds(20,470,30,30);
    b34.setBounds(70,470,30,30);
    b35.setBounds(20,520,30,30);
    f.add(b1);
    f.add(b2);
    f.add(b3);
    f.add(b4);
    f.add(b5);
    f.add(b6);
    f.add(b7);
    f.add(b8);
    f.add(b9);
    f.add(b10);
    f.add(b11);
    f.add(b12);
    f.add(b13);
    f.add(b14);
    f.add(b15);
    f.add(b16);
    f.add(b17);
    f.add(b18);
    f.add(b19);
    f.add(b20);
    f.add(b21);
    f.add(b22);
    f.add(b23);
    f.add(b24);
    f.add(b25);
    f.add(b26);
    f.add(b27);
    f.add(b28);
    f.add(b29);
    f.add(b30);
    f.add(b31);
    f.add(b32);
    f.add(b33);
    f.add(b34);
    f.add(b35);
    f.add(b36);
    Button b37=new Button("EXIT");
    f.add(b37);
    b37.setBackground(Color.magenta);

    f.add(g);
      b1.setBackground(Color.magenta);
      b2.setBackground(Color.magenta);
      b3.setBackground(Color.magenta);
      b4.setBackground(Color.magenta);
      b5.setBackground(Color.magenta);
      b6.setBackground(Color.magenta);
      b7.setBackground(Color.magenta);
      b8.setBackground(Color.magenta);
      b9.setBackground(Color.magenta);
      b10.setBackground(Color.magenta);
      b31.setBackground(Color.magenta);
      b32.setBackground(Color.magenta);
      b33.setBackground(Color.magenta);
      b34.setBackground(Color.magenta);
      b35.setBackground(Color.magenta);
      b36.setBackground(Color.magenta);
      b21.setBackground(Color.magenta);
      b22.setBackground(Color.magenta);
      b23.setBackground(Color.magenta);
      b24.setBackground(Color.magenta);
      b25.setBackground(Color.magenta);
      b26.setBackground(Color.magenta);
      b27.setBackground(Color.magenta);
      b28.setBackground(Color.magenta);
      b29.setBackground(Color.magenta);
      b30.setBackground(Color.magenta);
      b11.setBackground(Color.magenta);
      b12.setBackground(Color.magenta);
      b13.setBackground(Color.magenta);
      b14.setBackground(Color.magenta);
      b15.setBackground(Color.magenta);
      b16.setBackground(Color.magenta);
      b17.setBackground(Color.magenta);
      b18.setBackground(Color.magenta);
      b19.setBackground(Color.magenta);
      b20.setBackground(Color.magenta);
      g.setBackground(Color.magenta);
      b1.setFont(new Font("Fourier",Font.BOLD,20));
      b2.setFont(new Font("Fourier",Font.BOLD,20));
      b3.setFont(new Font("Fourier",Font.BOLD,20));
      b4.setFont(new Font("Fourier",Font.BOLD,20));
      b5.setFont(new Font("Fourier",Font.BOLD,20));
      b6.setFont(new Font("Fourier",Font.BOLD,20));
      b7.setFont(new Font("Fourier",Font.BOLD,20));
      b8.setFont(new Font("Fourier",Font.BOLD,20));
      b9.setFont(new Font("Fourier",Font.BOLD,20));
      b10.setFont(new Font("Fourier",Font.BOLD,20));
      b31.setFont(new Font("Fourier",Font.BOLD,20));
      b32.setFont(new Font("Fourier",Font.BOLD,20));
      b33.setFont(new Font("Fourier",Font.BOLD,20));
      b34.setFont(new Font("Fourier",Font.BOLD,20));
      b35.setFont(new Font("Fourier",Font.BOLD,20));
      b36.setFont(new Font("Fourier",Font.BOLD,20));
      g.setFont(new Font("Fourier",Font.BOLD,20));
      b21.setFont(new Font("Fourier",Font.BOLD,20));
      b22.setFont(new Font("Fourier",Font.BOLD,20));
      b23.setFont(new Font("Fourier",Font.BOLD,20));
      b24.setFont(new Font("Fourier",Font.BOLD,20));
      b25.setFont(new Font("Fourier",Font.BOLD,20));
      b26.setFont(new Font("Fourier",Font.BOLD,20));
      b27.setFont(new Font("Fourier",Font.BOLD,20));
      b28.setFont(new Font("Fourier",Font.BOLD,20));
      b29.setFont(new Font("Fourier",Font.BOLD,20));
      b30.setFont(new Font("Fourier",Font.BOLD,20));
      b37.setFont(new Font("Fourier",Font.BOLD,50));

         b11.setFont(new Font("Fourier",Font.BOLD,20));
          b12.setFont(new Font("Fourier",Font.BOLD,20));
          b13.setFont(new Font("Fourier",Font.BOLD,20));
          b14.setFont(new Font("Fourier",Font.BOLD,20));
          b15.setFont(new Font("Fourier",Font.BOLD,20));
          b16.setFont(new Font("Fourier",Font.BOLD,20));
          b17.setFont(new Font("Fourier",Font.BOLD,20));
          b18.setFont(new Font("Fourier",Font.BOLD,20));
          b19.setFont(new Font("Fourier",Font.BOLD,20));
          b20.setFont(new Font("Fourier",Font.BOLD,20));
          Label l1=new Label("Level 1");
          Label l2=new Label("Level 2");
          Label l3=new Label("Level 3");
          Label l4=new Label("Level 4");
          Label l5=new Label("Level 5");
          Label l6=new Label("Level 6");
          Label l7=new Label("Level 7");
          Label l8=new Label("Level 8");
          Label l9=new Label("Level 9");
          Label l10=new Label("Level 10");
          Label l11=new Label("Level G");
          l1.setFont(new Font("Fourier",Font.BOLD,20));
          l2.setFont(new Font("Fourier",Font.BOLD,20));
          l3.setFont(new Font("Fourier",Font.BOLD,20));
          l4.setFont(new Font("Fourier",Font.BOLD,20));
          l5.setFont(new Font("Fourier",Font.BOLD,20));
          l6.setFont(new Font("Fourier",Font.BOLD,20));
          l7.setFont(new Font("Fourier",Font.BOLD,20));
          l8.setFont(new Font("Fourier",Font.BOLD,20));
          l9.setFont(new Font("Fourier",Font.BOLD,20));
          l10.setFont(new Font("Fourier",Font.BOLD,20));
          l11.setFont(new Font("Fourier",Font.BOLD,20));
          f.add(l1);
          f.add(l2);
          f.add(l3);
          f.add(l4);
          f.add(l5);
          f.add(l6);
          f.add(l7);
          f.add(l8);
          f.add(l9);
          f.add(l10);
          f.add(l11);
          l1.setVisible(true);
          l2.setVisible(true);
          l3.setVisible(true);
          l4.setVisible(true);
          l5.setVisible(true);
          l6.setVisible(true);
          l7.setVisible(true);
          l8.setVisible(true);
          l9.setVisible(true);
          b37.setVisible(true);
          b37.setBounds(400,450,200,200);

          l10.setVisible(true);
          l11.setVisible(true);
          l10.setBounds(250,20,100,30);
          l9.setBounds(250,70,100,30);
          l8.setBounds(250,120,100,30);
          l7.setBounds(250,170,100,30);
          l6.setBounds(250,220,100,30);
          l5.setBounds(250,270,100,30);
          l4.setBounds(250,320,100,30);
          l3.setBounds(250,370,100,30);
          l2.setBounds(250,420,100,30);
          l1.setBounds(250,470,100,30);
          l11.setBounds(250,520,100,30);

          b37.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
              System.exit(0);
            }});
b1.addActionListener(new ActionListener(){
  public void actionPerformed(ActionEvent e)
  {
    b1.setBackground(Color.red);
    if(pos<1)
    {
      arr[1]=1;
      if(n>470)
      {
        n=470;
      }
    }
    else if(pos>1)
    {
      brr[1]=1;
      if(m<470)
      {
        m=470;
      }
    }
}
});
b2.addActionListener(new ActionListener(){
  public void actionPerformed(ActionEvent e)
  {    b2.setBackground(Color.red);

    if(pos<2)
    {
      arr[2]=1;
      if(n>420)
      {
        n=420;
      }
    }
    else if(pos>2)
    {
      brr[2]=1;
      if(m<420)
      {
        m=420;
      }
    }
  }
});
b3.addActionListener(new ActionListener(){
  public void actionPerformed(ActionEvent e)
  {    b3.setBackground(Color.red);

    if(pos<3)
    {
      arr[3]=1;
      if(n>370)
      {
        n=370;
      }
    }
    else if(pos>3)
    {
      brr[3]=1;
      if(m<370)
      {
        m=370;
      }

    }

  }
});
b4.addActionListener(new ActionListener(){
  public void actionPerformed(ActionEvent e)
  {    b4.setBackground(Color.red);

  if(pos<4)
  {
    arr[4]=1;
    if(n>320)
    {
      n=320;
    }
    u=1;
  }
  else if(pos>4)
  {
    brr[4]=1;
    d=1;
    if(m<320)
    {
      m=320;
    }
  }
  }
});
b5.addActionListener(new ActionListener(){
  public void actionPerformed(ActionEvent e)
  {    b5.setBackground(Color.red);

    if(pos<5)
    {
      arr[5]=1;
      if(n>270)
      {
        n=270;
      }
    }
    else if(pos>5)
    {
      brr[5]=1;
      if(m<270)
      {
        m=270;
      }
    }
  }
});
b6.addActionListener(new ActionListener(){
  public void actionPerformed(ActionEvent e)
  {    b6.setBackground(Color.red);

    if(pos<6)
    {
      arr[6]=1;
      if(n>220)
      {
        n=220;
      }
    }
    else if(pos>6)
    {
      brr[6]=1;
      if(m<220)
      {
        m=220;
      }
    }
  }
});
b7.addActionListener(new ActionListener(){
  public void actionPerformed(ActionEvent e)
  {    b7.setBackground(Color.red);

    if(pos<7)
    {
      arr[7]=1;
      if(n>170)
      {
        n=170;
      }
    }
    else if(pos>7)
    {
      brr[7]=1;
      if(m<170)
      {
        m=170;
      }
  }
  }
});
b8.addActionListener(new ActionListener(){
  public void actionPerformed(ActionEvent e)
  {    b8.setBackground(Color.red);

    if(pos<8)
    {
      arr[8]=1;
      if(n>120)
      {
        n=120;
      }
    }
    else if(pos>8)
    {
      brr[8]=1;
      if(m<120)
      {
        m=120;
      }
    }
  }
});
b9.addActionListener(new ActionListener(){
  public void actionPerformed(ActionEvent e)
  {    b9.setBackground(Color.red);

    if(pos<9)
    {
      arr[9]=1;
      if(n>70)
      {
        n=70;
      }
    }
    else if(pos>9)
    {
      brr[9]=1;
      if(m<70)
      {
        m=70;
      }
    }
  }
});
b10.addActionListener(new ActionListener(){
  public void actionPerformed(ActionEvent e)
  {    b10.setBackground(Color.red);

      if(pos<10)
      {
        arr[10]=1;
        if(n>10)
        {
          n=10;
        }
      }
      else if(pos>10)
      {

        if(m<10)
        {
          m=10;
        }
      }}
});
g.addActionListener(new ActionListener(){
  public void actionPerformed(ActionEvent e)
  {
    g.setBackground(Color.red);

  if(pos>0)
  {
    brr[0]=1;
    if(m<520)
    {
      m=520;
    }
  }

  }
});
b16.addActionListener(new ActionListener(){
  public void actionPerformed(ActionEvent e)
  {    b16.setBackground(Color.red);

arr[10]=1;
if(d==0)
{
  d=1;
}

if(n>20)
{
  n=20;
}
  }
});
b17.addActionListener(new ActionListener(){
  public void actionPerformed(ActionEvent e)
  {    b17.setBackground(Color.red);

arr[9]=1;

if(u==0)
{
  u=1;
}
if(n>70)
{
  n=70;
}
if(m<70)
{
  m=70;
}
  }
});
b18.addActionListener(new ActionListener(){
  public void actionPerformed(ActionEvent e)
  {    b18.setBackground(Color.red);

brr[9]=1;

if(d==0)
{
  d=1;
}
if(n>70)
{
  n=70;
}
if(m<70)
{
  m=70;
}
  }
});
b19.addActionListener(new ActionListener(){
  public void actionPerformed(ActionEvent e)
  {    b19.setBackground(Color.red);

arr[8]=1;
if(u==0)
{
  u=1;
}
if(m<120)
{
  m=120;
}
if(n>120)
{
n=120;
}
  }
});
b20.addActionListener(new ActionListener(){
  public void actionPerformed(ActionEvent e)
  {    b20.setBackground(Color.red);

brr[8]=1;
if(d==0)
{
  d=1;
}
if(n>120)
{
n=120;
}
if(m<120)
{
  m=120;
}
  }
});
b21.addActionListener(new ActionListener(){
  public void actionPerformed(ActionEvent e)
  {

    b21.setBackground(Color.red);
arr[7]=1;
if(u==0)
{
  u=1;
}
if(n>170)
{
  n=170;
}
if(m<170)
{
  m=170;
}
  }
});
b22.addActionListener(new ActionListener(){
  public void actionPerformed(ActionEvent e)
  {
    b22.setBackground(Color.red);
brr[7]=1;
if(d==0)
{
  d=1;
}
if(n>170)
{
  n=170;
}
if(m<170)
{
  m=170;
}
  }
});
b23.addActionListener(new ActionListener(){
  public void actionPerformed(ActionEvent e)
  {
    b23.setBackground(Color.red);
arr[6]=1;
if(u==0)
{
  u=1;
}
if(n>220)
{
  n=220;
}
if(m<220)
{
  m=220;
}
  }
});
b24.addActionListener(new ActionListener(){
  public void actionPerformed(ActionEvent e)
  {
    b24.setBackground(Color.red);
brr[6]=1;
if(d==0)
{
  d=1;
}
if(m<220)
{
  m=220;
}
if(n>220)
{
  n=220;
}
  }
});
b25.addActionListener(new ActionListener(){
  public void actionPerformed(ActionEvent e)
  {
    b25.setBackground(Color.red);
arr[5]=1;
if(u==0)
{
  u=1;
}
if(n>270)
{
  n=270;
}
if(m<270)
{
  m=270;
}
  }
});
b26.addActionListener(new ActionListener(){
  public void actionPerformed(ActionEvent e)
  {
    b26.setBackground(Color.red);
brr[5]=1;
if(d==0)
{
  d=1;
}if(n>270)
{
  n=270;
}
if(m<270)
{
  m=270;
}
  }
});
b27.addActionListener(new ActionListener(){
  public void actionPerformed(ActionEvent e)
  {
    b27.setBackground(Color.red);
arr[4]=1;
if(u==0)
{
  u=1;
}
if(n>320)
{
  n=320;
}
if(m<320)
{
  m=320;
}
  }
});
b28.addActionListener(new ActionListener(){
  public void actionPerformed(ActionEvent e)
  {
    b28.setBackground(Color.red);
brr[4]=1;
if(d==0)
{
  d=1;
}
if(m<320)
{
  m=320;
}
if(n>320)
{
  n=320;
}
  }
});
b29.addActionListener(new ActionListener(){
  public void actionPerformed(ActionEvent e)
  {
    b29.setBackground(Color.red);
arr[3]=1;
if(u==0)
{
  u=1;
}
if(n>370)
{
  n=370;
}
if(m<370)
{
  m=370;
}
  }
});
b30.addActionListener(new ActionListener(){
  public void actionPerformed(ActionEvent e)
  {

    b30.setBackground(Color.red);
brr[3]=1;
if(d==0)
{
  d=1;
}
if(m<370)
{
  m=370;
}
if(n>370)
{
  n=370;
}
  }
});
b31.addActionListener(new ActionListener(){
  public void actionPerformed(ActionEvent e)
  {
    b31.setBackground(Color.red);
arr[2]=1;
if(u==0)
{
  u=1;
}
if(n>420)
{
  n=420;
}
if(m<420)
{
  m=420;
}

  }
});
b32.addActionListener(new ActionListener(){
  public void actionPerformed(ActionEvent e)
  {

    b32.setBackground(Color.red);
brr[2]=1;
if(d==0)
{
  d=1;
}
if(n>420)
{
  n=420;
}
if(m<420)
{
  m=420;
}
  }
});
b33.addActionListener(new ActionListener(){
  public void actionPerformed(ActionEvent e)
  {

    b33.setBackground(Color.red);
arr[1]=1;
if(u==0)
{
  u=1;
}
if(n>470)
{
  n=470;
}
if(m<470)
{
  m=470;
}
  }
});
b34.addActionListener(new ActionListener(){
  public void actionPerformed(ActionEvent e)
  {

    b34.setBackground(Color.red);
brr[1]=1;
if(d==0)
{
  d=1;
}
if(m<470)
{
  m=470;
}
if(n>470)
{
  n=470;
}
  }
});
b35.addActionListener(new ActionListener(){
  public void actionPerformed(ActionEvent e)
  {

    b35.setBackground(Color.red);
arr[10]=1;
if(m<520)
{
  m=520;
}
  }
});
b11.addActionListener(new ActionListener(){
  public void actionPerformed(ActionEvent e)
  {
    b11.setBackground(Color.red);
    if(pos<10)
    {
arr[pos+1]=1;
if(crr[pos+1]<n)
{
  n=crr[pos+1];
}}
  }
});
b12.addActionListener(new ActionListener(){
  public void actionPerformed(ActionEvent e)
  {
    b12.setBackground(Color.red);
    if(pos>0)
    {
brr[pos-1]=1;
if(crr[pos-1]>m)
{
  m=crr[pos-1];
}}
  }
});

while(true)
{u=1;
  d=1;
if(u==1)
{
  x=b.getX();
  y=b.getY();
  for(i=y;i>=n;i--)
  {
    b.setBounds(120,i,100,50);
    h=(i/50);
    h=10-h;
    pos=h;
      if(arr[h]==1)
      {
        if(i==crr[h])
        {
          if(pos==0)
          {
            g.setBackground(Color.magenta);
            b34.setBackground(Color.magenta);
            b12.setBackground(Color.magenta);
          }
          else if(pos==1)
          {
            b1.setBackground(Color.magenta);
            b11.setBackground(Color.magenta);
            b33.setBackground(Color.magenta);

          }
          else if(pos==2)
          {
            b2.setBackground(Color.magenta);
            b11.setBackground(Color.magenta);
            b31.setBackground(Color.magenta);

          }
          else if(pos==3)
          {
            b3.setBackground(Color.magenta);
            b11.setBackground(Color.magenta);
            b29.setBackground(Color.magenta);

          }
          else if(pos==4)
          {
            b4.setBackground(Color.magenta);
            b11.setBackground(Color.magenta);
            b27.setBackground(Color.magenta);

          }
          else if(pos==5)
          {
            b5.setBackground(Color.magenta);
            b11.setBackground(Color.magenta);
            b25.setBackground(Color.magenta);

          }
          else if(pos==6)
          {
            b6.setBackground(Color.magenta);
            b11.setBackground(Color.magenta);
            b23.setBackground(Color.magenta);

          }
          else if(pos==7)
          {
            b7.setBackground(Color.magenta);
            b11.setBackground(Color.magenta);
            b21.setBackground(Color.magenta);

          }
          else if(pos==8)
          {
            b8.setBackground(Color.magenta);
            b11.setBackground(Color.magenta);
            b19.setBackground(Color.magenta);

          }
          else if(pos==9)
          {
            b9.setBackground(Color.magenta);
            b11.setBackground(Color.magenta);
            b17.setBackground(Color.magenta);

          }
          else if(pos==10)
          {
            b10.setBackground(Color.magenta);
            b11.setBackground(Color.magenta);
            b16.setBackground(Color.magenta);

          }
          Thread.sleep(500);
            for(j=0;j<=50;j++)
            {
              bx.setBounds(0,0,50-j,50);
              by.setBounds(50+j,0,50-j,50);
              Thread.sleep(40);
            }
            Thread.sleep(500);
            for(j=0;j<=50;j++)
            {
              bx.setBounds(0,0,0+j,50);
              by.setBounds(100-j,0,0+j,50);
              Thread.sleep(40);
            }
            arr[h]=0;
        }

      }
    Thread.sleep(20);
    if(i==n)
    {
      n=520;
    }
  }

}
 if(d==1)
{
  x=b.getX();
  y=b.getY();
  for(i=y;i<=m;i++)
  {
    b.setBounds(120,i,100,50);
    h=(i/50);
    h=10-h;
    pos=h;
      if(brr[h]==1)
      {
        if(i==crr[h])
        {
          if(pos==0)
        {
          g.setBackground(Color.magenta);
          b35.setBackground(Color.magenta);
          b12.setBackground(Color.magenta);
        }
        else if(pos==1)
        {
          b1.setBackground(Color.magenta);
          b12.setBackground(Color.magenta);
          b34.setBackground(Color.magenta);

        }
        else if(pos==2)
        {
          b2.setBackground(Color.magenta);
          b12.setBackground(Color.magenta);
          b32.setBackground(Color.magenta);

        }
        else if(pos==3)
        {
          b3.setBackground(Color.magenta);
          b12.setBackground(Color.magenta);
          b30.setBackground(Color.magenta);

        }
        else if(pos==4)
        {
          b4.setBackground(Color.magenta);
          b12.setBackground(Color.magenta);
          b28.setBackground(Color.magenta);

        }
        else if(pos==5)
        {
          b5.setBackground(Color.magenta);
          b12.setBackground(Color.magenta);
          b26.setBackground(Color.magenta);

        }
        else if(pos==6)
        {
          b6.setBackground(Color.magenta);
          b12.setBackground(Color.magenta);
          b24.setBackground(Color.magenta);

        }
        else if(pos==7)
        {
          b7.setBackground(Color.magenta);
          b12.setBackground(Color.magenta);
          b22.setBackground(Color.magenta);

        }
        else if(pos==8)
        {
          b8.setBackground(Color.magenta);
          b12.setBackground(Color.magenta);
          b20.setBackground(Color.magenta);

        }
        else if(pos==9)
        {
          b9.setBackground(Color.magenta);
          b12.setBackground(Color.magenta);
          b18.setBackground(Color.magenta);

        }
        else if(pos==10)
        {
          b10.setBackground(Color.magenta);
          b12.setBackground(Color.magenta);
          b16.setBackground(Color.magenta);

        }
          Thread.sleep(500);
            for(j=0;j<=50;j++)
            {
              bx.setBounds(0,0,50-j,50);
              by.setBounds(50+j,0,50-j,50);
              Thread.sleep(40);
            }
            Thread.sleep(500);
            for(j=0;j<=50;j++)
            {
              bx.setBounds(0,0,0+j,50);
              by.setBounds(100-j,0,0+j,50);
              Thread.sleep(40);
            }
            brr[h]=0;
        }
      }
    Thread.sleep(20);
    if(i==m)
    {
      m=10;
    }
}
}}
  }
}
