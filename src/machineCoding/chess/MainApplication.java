package machineCoding.chess;
import machineCoding.chess.chessvalidatorservice.ChessValidatorService;

import java.util.Scanner;

import static machineCoding.chess.Board.ChessBoardUtil.getInitialState;

public class MainApplication {
    public static void main(String[] args) {
        String state[][]= getInitialState();
        ChessValidatorService chessValidatorService = new ChessValidatorService(state);
        String move[] = new String[2];
        move[0]= "WP 12 22";
        move[1]= "BP 60 64";

        int i=0;
        while(i<move.length){

            Integer initialState= Integer.parseInt(move[i].trim().substring(3,5));
            Integer finalState= Integer.parseInt(move[i].trim().substring(6,8));
            int rs= initialState/10;
            int cs= initialState%10;
            int re=finalState/10;
            int ce=finalState%10;
            System.out.print(move[i] +" : ");
            chessValidatorService.validateMove(rs,cs,re,ce);

            chessValidatorService.printCurrentState();

            i++;
        }


    }
}
