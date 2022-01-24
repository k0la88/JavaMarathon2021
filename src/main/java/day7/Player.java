package day7;

public class Player {
    private int stamina;
    static int countPlayers;
    final static int MAX_STAMINA = 100;
    final static int MIN_STAMINA = 0;

    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayers < 6)
            countPlayers++;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public static void run(Player player, String decree) {
        if (decree.equals("устать")) {
            System.out.println("Игрок бежит");
            //player.stamina = MIN_STAMINA;    // можно наверное и без цикла было бы.
            for (int i = player.getStamina() ; i > 0 ; i--)
                player.stamina--;


        } else if (player.getStamina() > MIN_STAMINA) {
            System.out.println("Игрок бежит");
            player.stamina--;
        }
        if (player.getStamina() == MIN_STAMINA) {
            System.out.println("Игроку нужен отдых. Игрок уходит с поля");
            if (getCountPlayers() > 0)
                countPlayers--;
        }
    }

    public static void info() {
        String[] text = new String[]{" свободное место", " свободных места",
                                     " свободных мест", " игрок", " игрока", " игроков"};
        String str, str2;
        if (getCountPlayers() < 6 && getCountPlayers() != 0) {
            if (6 - getCountPlayers() == 1) {
                str = text[0];
                str2 = text[5];
            } else if (6 - getCountPlayers() > 1 && 6 - getCountPlayers() <= 4) {
                str = text[1];
                str2 = text[4];
            } else {
                str = text[2];
                str2 = text[3];
            }
            System.out.println("На поле " + getCountPlayers() + str2 + ".");
            System.out.println("Команды неполные. На поле еще есть " + (6 - getCountPlayers()) + str + ".");
        } else
            if (getCountPlayers() == 6) System.out.println("На поле "+ Player.getCountPlayers()+text[5] +
                    "," + text[2] + " нет.");
            else System.out.println("На поле нет" + text[5] + ".");

    }
}
