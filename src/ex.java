
import java.awt.*;
import java.awt.event.*;

public class ex {
    public static void main(String[] args) {
        Frame f = new Frame("Frame Test3");
        f.setSize(300, 200);
        f.addWindowListener(new EventHandler()); //위임한거임 windowlistener 타입이어야 하느너 ㄱ객체에
        f.setVisible(true);

    }
}

 class EventHandler implements WindowListener { //extends WindowAdapter {
//abstract일때에는 객체 생성이 불가하므로 추상 메소드를 재 정의 해줘야한다.
     // 어댑터는 이미 재정의 해서 가지고 있음 불필요한 재정의과정을 없애준다.
     
     @Override
     public void windowOpened(WindowEvent e) {

     }

     @Override
    public void windowClosing(WindowEvent we) {
        we.getWindow().setVisible(false);
        we.getWindow().dispose();
        System.exit(0);
    }

     @Override
     public void windowClosed(WindowEvent e) {

     }

     @Override
     public void windowIconified(WindowEvent e) {

     }

     @Override
     public void windowDeiconified(WindowEvent e) {

     }

     @Override
     public void windowActivated(WindowEvent e) {

     }

     @Override
     public void windowDeactivated(WindowEvent e) {

     }

 }