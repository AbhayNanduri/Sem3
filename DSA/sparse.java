import java.util.*;
public class sparse {
    public static void main(String[] args){
        int sparsematrix[][] = 
            {{0,0,2,0},
             {8,0,0,3},
             {0,1,0,0},
             {0,0,0,6}};
        int size = 0;
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                if(sparsematrix[i][j]!=0){
                    size++;
                }
            }
        }
        int compactmatrix[][] = new int[3][size];
        int k=0;
        for(int r=0;r<4;r++){
            for(int c=0;c<4;c++){
                if(sparsematrix[r][c]!=0){
                    compactmatrix[0][k]=r;
                    compactmatrix[1][k]=c;
                    compactmatrix[2][k]=sparsematrix[r][c];
                    k++;
                }
            }
        }
        //printing the matrix
        for(int i=0;i<3;i++){
            for(int j=0;j<size;j++){
                System.out.printf("%d",compactmatrix[i][j]);
            }
            System.out.printf("/n");
        }
    }
}
