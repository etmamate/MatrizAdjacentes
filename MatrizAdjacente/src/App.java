public class App {
    public static void main(String[] args) throws Exception {
        // Números de vertices no grafo
        int numVertices = 6;
        int ponto = 1;

        // Criando uma matriz de adjacencia de tamanho [numVertices x numVerices]
        int[][] matrizAdjacencia = new int[numVertices][numVertices];

        // inicializando a matriz com base na lista de adjacências fornecida

        // Vértice 1: conecta com 3 e 6
        matrizAdjacencia[0][2] = ponto;
        matrizAdjacencia[0][5] = ponto;

        // Vertice 2: conecta com 4, 5 e 6
        matrizAdjacencia[1][3] = ponto;
        matrizAdjacencia[1][4] = ponto;
        matrizAdjacencia[1][5] = ponto;

        // vertice 3: conecta com 1 e 4
        matrizAdjacencia[2][0] = ponto;
        matrizAdjacencia[2][3] = ponto;

        // vertice 4: conecta com 2, 3 e 6
        matrizAdjacencia[3][1] = ponto;
        matrizAdjacencia[3][2] = ponto;
        matrizAdjacencia[3][5] = ponto;

        // vertice 5: conecta com 2
        matrizAdjacencia[4][1] = ponto;

        // vertice 6: conecta com 1, 2 e 4
        matrizAdjacencia[5][0] = ponto;
        matrizAdjacencia[5][1] = ponto;
        matrizAdjacencia[5][3] = ponto;

        // Exibindo a matriz de adjacências
        System.out.println("Matriz de Adjacências");
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                System.out.print(matrizAdjacencia[i][j] + " ");
            }
            System.out.println();
        }
    }
}
