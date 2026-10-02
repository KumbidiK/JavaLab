import java.awt.*;
import java.awt.event.*;

class StudentRegistration extends Frame implements ActionListener {

    TextField name, regno;
    Choice course;
    Checkbox male, female;
    Checkbox java, python;
    Button submit, clear;
    Label result;

    StudentRegistration() {

        setLayout(new FlowLayout());

        add(new Label("Name:"));
        name = new TextField(20);
        add(name);

        add(new Label("Register No:"));
        regno = new TextField(20);
        add(regno);

        add(new Label("Course:"));
        course = new Choice();
        course.add("BCS");
        course.add("BCA");
        course.add("BBA");
        add(course);

        add(new Label("Gender:"));

        male = new Checkbox("Male");
        female = new Checkbox("Female");

        add(male);
        add(female);

        add(new Label("Hobbies:"));

        java = new Checkbox("Java");
        python = new Checkbox("Python");

        add(java);
        add(python);

        submit = new Button("Submit");
        clear = new Button("Clear");

        add(submit);
        add(clear);

        result = new Label();
        add(result);

        submit.addActionListener(this);
        clear.addActionListener(this);

        setSize(400, 400);
        setTitle("Student Registration");
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == submit) {

            result.setText(
                "Name: " + name.getText()
                + " Reg No: " + regno.getText()
            );
        }

        if (e.getSource() == clear) {
            name.setText("");
            regno.setText("");
            result.setText("");
        }
    }

    public static void main(String[] args) {
        new StudentRegistration();
    }
}