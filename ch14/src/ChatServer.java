import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatServer extends JFrame {
    private JTextField sender = null;
    private Receiver receiver = null;

    private BufferedReader bufferedReader = null;
    private BufferedWriter bufferedWriter = null;
    private Socket socket = null;
    private ServerSocket serverSocket = null;

    ChatServer() {
        this.setTitle("목톡 서버");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = this.getContentPane();
        contentPane.setLayout(new BorderLayout());
        sender = new JTextField();
        contentPane.add(sender, BorderLayout.SOUTH);
        receiver = new Receiver();
        contentPane.add(new JScrollPane(receiver), BorderLayout.CENTER);

        sender.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // System.out.println("enter눌렀음");
                String msg = sender.getText();
                try {
                    bufferedWriter.write(msg + "\n");
                    bufferedWriter.flush();
                    receiver.append("server : " + msg + "\n");
                    sender.setText("");
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }

        });

        try {
            serverSocket = new ServerSocket(9998);
            socket = serverSocket.accept();
            receiver.append("클라이언트 연결되었음" + "\n");
            // System.out.println("연결 되었음");
            bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        } catch (UnknownHostException e) {
            System.out.println("서버 안켰음");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }

        this.setSize(400, 500);
        this.setVisible(true);
        Thread thread = new Thread(receiver);
        thread.start();
    }

    class Receiver extends JTextArea implements Runnable {

        @Override
        public void run() {
            String msg = null;
            while (true) {
                try {
                    msg = bufferedReader.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                this.append("client : " + msg + "\n");
                int scrollPosition = this.getText().length();
                this.setCaretPosition(scrollPosition);
            }

        }
    }

    public static void main(String[] args) {
        new ChatServer();
    }
}