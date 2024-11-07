public class Main {
    public static void main(String[] args) {
        Book theCountOfMonteCristo = new Book("Граф Монте-Кристо", new Author("Александр", "Дюма"), 1846);
        Book annaKarenina = new Book("Анна Каренина", new Author("Лев", "Толстой"), 1877);
        Author dmitry = new Author("Дмитрий", "Песков");
        Author sergey = new Author("Сергей", "Сафонов");
        System.out.println("Книга «" + theCountOfMonteCristo.getBookName() + "», автором которой является " + theCountOfMonteCristo.getAuthor().getFirstName() + " " + theCountOfMonteCristo.getAuthor().getSecondName() + ", была опубликована в " + theCountOfMonteCristo.getYearOfPublication() + " году");
        System.out.println("Книга «" + annaKarenina.getBookName() + "», автором которой является " + annaKarenina.getAuthor().getFirstName() + " " + annaKarenina.getAuthor().getSecondName() + ", была опубликована в " + annaKarenina.getYearOfPublication() + " году");
        System.out.println("Автор номер 1 - " + dmitry.getFirstName() + " " + dmitry.getSecondName());
        System.out.println("Автор номер 2 - " + sergey.getFirstName() + " " + sergey.getSecondName());
        annaKarenina.setYearOfPublication(1876);
        System.out.println("У книги «" + annaKarenina.getBookName() + "», автором которой является " + annaKarenina.getAuthor().getFirstName() + " " + annaKarenina.getAuthor().getSecondName() + ", новые данные. Год публикации изменён на " + annaKarenina.getYearOfPublication());
    }
}