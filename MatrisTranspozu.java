public class MatrisTranspozu {
    public static void main(String[] args) {
        int [][] matris = {{1,2,3},{4,5,6},{7,8,9}};
        for(int i = 0; i< matris.length;i++){
            for(int j = 0; j<matris[0].length; j++){
                System.out.print(matris[i][j] + " ");
            }
            System.out.println(" ");
        }
        int [][] transpoz = new int[3][3];
        System.out.println(" ");


        for(int i = 0; i< matris.length;i++){
            for(int j = 0; j<matris[0].length; j++){
                transpoz[i][j] = matris [j][i];
                System.out.print(transpoz[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
