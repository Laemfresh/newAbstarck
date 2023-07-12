public class Main {
    public static void main(String[] args) {
        Farm1 farm = new Farm1("Hooliwood",new Cow[5],new Sheep[3],new Hourse[2],"John kramer");
     //   Farm1 farm = new Farm1("Hooliwood", new Cow[5], new Sheep[3], new Hourse[2],"It KG");
        Cow cow = new Cow(30,1,"Male","ferdinand");
        Cow cow1 = new Cow(15,0,"Female","mahito");
        Cow cow2 = new Cow(45,6,"Male","tornado");
        Cow cow3 = new Cow(50,1, "Female", "redbull");
        Cow cow4 = new Cow(10,0,"Male","");
        Cow[]cows ={cow,cow1,cow2,cow3,cow4};
        farm.setCows(cows);

        Hourse hourse = new Hourse(100,2,"Female","Matilda");
        Hourse hourse1 = new Hourse(80,4,"Male","Guapo");
        Hourse[] horses = {hourse, hourse1};
        farm.setHourses(horses);

        Sheep sheep = new Sheep(30,2,"male","vacya");
        Sheep sheep1 = new Sheep(15,2,"female","kashtan");
        Sheep sheep2 = new Sheep(26,2,"male","mikki");
        Sheep[] sheep3 = {sheep, sheep2,sheep1};
        farm.setSheep(sheep3);
        System.out.println(farm);

        Farm1 farm1 = new Farm1("Tashkent", new Cow[1], new Sheep[1], new Hourse[1],"Wtf");
        Cow cow5 = new Cow(59,2,"Male","noname");
        Cow[] cows1 = {cow5};
        farm1.setCows(cows1);

        Hourse horse2 = new Hourse(30,2,"Male","flash");
        Hourse[] horses1 = {horse2};
        farm1.setHourses(horses1);

        Sheep sheep4 = new Sheep(50,2,"Male","chupokabra");
        Sheep[] sheep5 = {sheep4};
        farm1.setSheep(sheep5);
        System.out.println(farm1);
    }
}