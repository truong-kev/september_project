import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import java.util.Scanner;

public class Module3 extends Application{

    Module1 module1;
    Module2 module2;
    Scanner scanner;
    int input1, input2, input3;
    Stage window;
    Scene first, scene1d, scene2d;

    public static void Main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        //initial setup
        module1 = new Module1();
        module2 = new Module2();
        scanner = new Scanner(System.in);
        window = primaryStage;
        window.setWidth(296);
        window.setHeight(300);

        //initial gridpane
        GridPane initial = new GridPane();
        initial.setHgap(10);
        initial.setHgap(10);
        first = new Scene(initial);
        Button button_1d = new Button("1-D Array");
        button_1d.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                //1d gridpane
                GridPane gridPane_1d = new GridPane();
                gridPane_1d.setVgap(10);
                gridPane_1d.setHgap(10);
                window.setTitle("1-D Array");
                scene1d = new Scene(gridPane_1d);

                //1-d buttons
                {
                    //getAtIndex
                    Button getAtIndex = new Button("getAtIndex");
                    getAtIndex.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent event) {
                            System.out.println(module1.getAtIndex());
                        }
                    });
                    gridPane_1d.add(getAtIndex, 0, 0);

                    //setAtIndex
                    Button setAtIndex = new Button("setAtIndex");
                    setAtIndex.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent event) {
                            module1.setAtIndex();
                        }
                    });
                    gridPane_1d.add(setAtIndex, 1, 0);

                    //findIndexOf
                    Button findIndexOf = new Button("findIndexOf");
                    findIndexOf.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent event) {
                            System.out.println(module1.findIndexOf());
                        }
                    });
                    gridPane_1d.add(findIndexOf, 2, 0);

                    //printAll
                    Button printAll = new Button("printAll");
                    printAll.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent event) {
                            module1.printAll();
                        }
                    });
                    gridPane_1d.add(printAll, 0, 1);

                    //deleteAtIndex
                    Button deleteAtIndex = new Button("deleteAtIndex");
                    deleteAtIndex.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent event) {
                            module1.deleteAtIndex();
                            System.out.println("Done");
                        }
                    });
                    gridPane_1d.add(deleteAtIndex, 1, 1);

                    //expand
                    Button expand = new Button("expand");
                    expand.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent event) {
                            System.out.println("Done");
                            module1.expand();
                        }
                    });
                    gridPane_1d.add(expand, 2, 1);

                    //shrink
                    Button shrink = new Button("shrink");
                    shrink.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent event) {
                            System.out.println("Done");
                            module1.shrink();
                        }
                    });
                    gridPane_1d.add(shrink, 0, 2);
                }

                Button back = new Button("Back");
                back.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        window.setScene(first);
                    }
                });
                gridPane_1d.add(back, 0, 3);

                Button exit = new Button("Exit");
                exit.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        window.close();
                    }
                });
                gridPane_1d.add(exit, 1, 3);

                window.setScene(scene1d);
                window.show();
            }
        });
        initial.add(button_1d, 0, 0);

        Button button_2d = new Button("2-D Array");
        button_2d.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                //2d gridpane
                GridPane gridPane_2d = new GridPane();
                gridPane_2d.setHgap(10);
                gridPane_2d.setVgap(10);
                window.setTitle("2-D Array");
                scene2d = new Scene(gridPane_2d);

                //2d buttons
                {
                    Button getAtIndex = new Button("getAtIndex");
                    getAtIndex.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent event) {
                            int temp = module2.getAtIndex();
                            System.out.println(temp);
                        }
                    });
                    gridPane_2d.add(getAtIndex, 0, 0);

                    //setAtIndex
                    Button setAtIndex = new Button("setAtIndex");
                    setAtIndex.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent event) {
                            module2.setAtIndex();
                            System.out.println("Done");
                        }
                    });
                    gridPane_2d.add(setAtIndex, 1, 0);

                    //findIndexOf
                    Button findIndexOf = new Button("findIndexOf");
                    findIndexOf.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent event) {
                            int[] indexes = module2.findIndexOf();
                            System.out.println("Row: " + indexes[0] + " Column: " + indexes[1]);
                        }
                    });
                    gridPane_2d.add(findIndexOf, 2, 0);

                    //printAll
                    Button printAll = new Button("printAll");
                    printAll.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent event) {
                            module2.printAll();
                        }
                    });
                    gridPane_2d.add(printAll, 0, 1);

                    //deleteAtIndex
                    Button deleteAtIndex = new Button("deleteAtIndex");
                    deleteAtIndex.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent event) {
                            module2.deleteAtIndex();
                            System.out.println("Done");
                        }
                    });
                    gridPane_2d.add(deleteAtIndex, 1, 1);

                    Button expand = new Button("expand");
                    expand.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent event) {
                            module2.expand();
                            System.out.println("Done");
                        }
                    });
                    gridPane_2d.add(expand, 2, 1);

                    //shrink
                    Button shrink = new Button("shrink");
                    shrink.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent event) {
                            module2.shrink();
                            System.out.println("Done");
                        }
                    });
                    gridPane_2d.add(shrink, 0, 2);
                }

                Button back = new Button("Back");
                back.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        window.setScene(first);
                    }
                });
                gridPane_2d.add(back, 0, 3);

                Button exit = new Button("Exit");
                exit.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        window.close();
                    }
                });
                gridPane_2d.add(exit, 1, 3);

                window.setScene(scene2d);
                window.show();
            }
        });
        initial.add(button_2d, 1, 0);

        Button exit = new Button("Exit");
        exit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                window.close();
            }
        });

        initial.add(exit, 0, 3);
        window.setTitle("Module 3");
        window.setScene(first);
        window.show();
    }
}