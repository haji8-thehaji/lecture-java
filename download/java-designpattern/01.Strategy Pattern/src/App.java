public class App {
    public static void main(String[] args) throws Exception {
        GameCharacter character = new GameCharacter();
        character.attack();

        character.setWeapon(new Knife());
        character.attack();

        character.setWeapon(new Sword());
        character.attack();

        character.setWeapon(new lky27100());
        character.attack();

        character.setWeapon(new jmg123123123());
        character.attack();
        
        character.setWeapon(new missile());
        character.attack();

        character.setWeapon(new choboram());
        character.attack();
    }
}
