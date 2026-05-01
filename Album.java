public class Album {
    private String titulo;
    private int anoLancamento;
    private double numeroDeVendas; 

    public Album (String titulo, int anoLancamento, double numeroDeVendas) {
        this.titulo = titulo; 
        this.anoLancamento = anoLancamento;
        this.numeroDeVendas = numeroDeVendas;
    }
        public void getDados () {
            System.out.println("Album = " + titulo);
            System.out.println("Ano de Lançamento = " + anoLancamento);
            System.out.println("Numero de vendas foram = " + numeroDeVendas);
            System.out.println(" --------------------------- ");
        }
        public String getTitulo() {
            return this.titulo; 
        }
        public String toString () {
            return "Album: " + titulo + "---" + " Ano: " + anoLancamento +  "Numero de Vendas: " + numeroDeVendas;
}
}