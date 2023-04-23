public enum Anniversary {
  ONEYEAR(" Ситцевая, следующая-бумажная"),
  TWOYEARS("Бумажная, следующая-кожаная"),
  THREEYEARS("Кожаная, следующая-льняная"),
  FOURYEARS(" Льняная (Восковая), следующая-деревянная"),
  FIVEYEARS("Деревянная, следующая-чугунная"),
    SIXYEARS("Чугунная, следующая-медная"),
    SEVENYEARS("Медная, следующая-жестяная"),
    EIGHTYEARS("Жестяная, следующая-фаянсовая"),
    NINEYEARS("Фаянсовая, следующая-розовая"),
    TENYEARS(" Розовая (Оловянная), следующая-стальная"),
    ELEVENYEARS(" Стальная, следующая-никелевая"),
    TWELVEYEARS("Никелевая, следующая-ландышевая");
  private final String description;

  public String getDescription() {
    return description;
  }
  Anniversary(String description){
    this.description = description;
  }
}
