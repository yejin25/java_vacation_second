package kr.ac.jbnu.se.tetris;

import java.awt.BorderLayout;
import java.io.File;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Tetris extends JFrame{    //JFrame 상속받음 게임 GUI 설정
    JLabel statusbar;   //상태바 선언

    public Tetris() {
        statusbar = new JLabel(" 0");   //JLabel 객체 생성 텍스트 "0"
        add(statusbar, BorderLayout.SOUTH); //텍스트를 보드의 왼쪽에 위치
        Board board = new Board(this);
        add(board);
        board.start();

        setSize(200, 400);  //보드 사이즈
        setTitle("Tetris");
        setDefaultCloseOperation(EXIT_ON_CLOSE);    //창 닫을 시 종료
    }

    public JLabel getStatusBar() {
        return statusbar;
    }
    public static void main(String[] args) {
        Tetris game = new Tetris();
        game.setLocationRelativeTo(null);
        game.setVisible(true);
        Bgm bgm = new Bgm(true);
        bgm.start();
    }
}