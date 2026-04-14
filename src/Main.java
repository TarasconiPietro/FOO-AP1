void main(){
    Bateria bateria = new Bateria(60, 4000);
    Celular celular = new Celular("Samsung", "Japones", bateria);

    celular.carregarCelular();
    celular.usarCelular(100);

    celular.carregarCelular();
    celular.usarCelular(30);
}