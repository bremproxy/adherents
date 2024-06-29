package cards.necro;
import interface_action.cardactionall;

public class sceleton implements cardactionall {
    public void attack(){
        System.out.println("Скилет атакует");
    }

    @Override
    public void defense() {
        System.out.println("Скилет защищается");
    }

    @Override
    public void parryind() {
        System.out.println("Скилет уклоняется");
    }

    @Override
    public char avatar() {
        return 'S';
    }
}
