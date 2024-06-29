package cards.elf;

import interface_action.cardactionall;

public class archer implements cardactionall  {
        public void attack(){
            System.out.println("Лучник атакует");
        }

        @Override
        public void defense() {
            System.out.println("Лучник защищается");
        }

        @Override
        public void parryind() {
            System.out.println("Лучник уклоняется");
        }

        @Override
        public char avatar() {
            return 'L';
        }

    }