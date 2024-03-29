package behavior;

import java.util.Random;

public class HeroesNames {
    private static Random rnd;
    private static String[] names = {"Джонатан Арчер",
            "Марвин",
            "Джеймс Тиберий Кирк",
            "Зефрам Кохрэйн",
            "Кэтрин Джейнвэй",
            "Леонард Маккой",
            "Монтгомери Скотт",
            "Нийота Ухура",
            "Павел Чехов",
            "Жан-Люк Пикар",
            "Зафод Библброкс",
            "Спок",
            "Артур Дент",
            "Уэсли Крашер",
            "Хикару Сулу",
            "Чарльз Такер III"

    };
    static {
        rnd = new Random();
    }

    public static String getName(int index)
    {
        if (index >= names.length)
            index = 0;
        return names[index];
    }

    public static String getRandomName()
    {
        return names[rnd.nextInt(names.length)];
    }
}
