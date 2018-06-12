class Input {
	public String askName(String name) {}
	public static String askName(String name) {}
}

Input input = new Input();

input.askName("text");

Input.askName("text");

String s = "";

int a = 5;

s = String.parse(a);
String b = "abcd"
b.substring(0, 3); => "abc"

int[] x = {1, 2}
System.out.println(x); => "[1, 2]"


String answer = Input.askString("Would you like to perform the transaction?");
if (answer.equals("yes"))
  System.out.println("Transaction performed.");
else
  System.out.println("Transaction cancelled.");


int x = 4;
System.out.println(2 + 2 == x); => "true"


true && false => "false"
false || false => "false"


1 != 2 => "true"
"true" == "true" => "true"

0 "true"
1 "true"
2

>=
<=


public class Point {
  private int x;
  private int y;

  public Point(int x, int y) {
     this.x = 0;
     this.y = 3;
  }

  public void show() {
     System.out.println(x);
     System.out.println(y);
  }
}

Point p = new Point(1, 2);
p.show();

=> "0"
=> "3"



public class Circle {
  private int radius;

  /**
   * This constructor creates a new circle with radius 3.
   */
  public Circle() {
      radius = 3;
  }
}


public class Point {
  private DoubleProperty x = new SimpleDoubleProperty();
  private double y;

  public DoubleProperty xProperty() {
  	return x;
  }

  public double getX() {
  	return x.get();
  }
}


while read() != -1 {
	// do the thing
}


func read()


for (int i = 0; i < 10; i++) {

}

for (int i = 0; i < array.length; i++) {
	print("hi " + i);
}

public abstract class Person {
	protected name
	protected age
	protected criminalRecord
	protected dealer

	public makeSound()
}


class Student extends Person implements Expellable {

	enrol()
	bitch()
	graffiti()

	@Override
	makeSound() {
		"*sobs over debt*"
	}

	@Override
	expell() {

	}
}


public interface Expellable {
	expell();
}


List<Person> person = new ArrayList<>();


"${controller.person.university.name}"

@FXML private Label l;

l.textProperty().bind(person.getUniversity().nameProperty());

@FXML private Button b;

EventHandler<ActionEvent> action = new EventHandler<ActionEvent>() {
  @Override
  public void handle(ActionEvent event) {
      System.out.println("Hello World!");
  }
});

b.setOnAction(action);

b.setOnAction(new EventHandler<ActionEvent>() {
  @Override
  public void handle(ActionEvent event) {
      System.out.println("Hello World!");
  }
});

b.setOnAction(new Clicker());


private class Clicker extends EventHandler<ActionEvent> {
	@Override
  public void handle(ActionEvent event) {
      System.out.println("Hello World!");
  }
}

b.setOnAction(event -> {
    @Override
    public void handle(ActionEvent event) {
        System.out.println("Hello World!");
    }
});



class Piano {
	private final int keys;

	public getKeys();
}


String kahootLink = "tinyurl.com/appsprogupass";



/*
 * Good luck on for exams guys, I know you'll smash it!
 */
