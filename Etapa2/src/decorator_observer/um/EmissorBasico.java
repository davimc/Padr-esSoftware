package decorator_observer.um;

public class EmissorBasico implements Emissor{
    @Override
    public void envia(String mensagem) {
        System.out.println("Enviando uma mensagem: ");
        System.out.println(mensagem);
    }
}
