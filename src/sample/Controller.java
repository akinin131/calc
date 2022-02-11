package sample;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label lable_btn;

    @FXML
    private Button clear_btn;

    @FXML
    private Button btn7;

    @FXML
    private Button btn4;

    @FXML
    private Button btn_1;

    @FXML
    private Button btn_0;

    @FXML
    private Button btn_p_m;

    @FXML
    private Button btn8;

    @FXML
    private Button btn5;

    @FXML
    private Button btn2;

    @FXML
    private Button comma;

    @FXML
    private Button btn3;

    @FXML
    private Button btn6;

    @FXML
    private Button btn9;

    @FXML
    private Button btn_pr;

    @FXML
    private Button delenie;

    @FXML
    private Button btn_ymnoj;

    @FXML
    private Button subtraction;

    @FXML
    private Button addition;

    @FXML
    private Button equally;
    String str = "";
    float furst=0;
    char operation;

    @FXML
    void initialize() {
        btn_0.setOnAction(event->{
            addNumber(0);
                }
        );
        btn_1.setOnAction(event->{
                    addNumber(1);
                }
        );
        btn2.setOnAction(event->{
                    addNumber(2);
                }
        );
        btn3.setOnAction(event->{
                    addNumber(3);
                }
        );
        btn4.setOnAction(event->{
                    addNumber(4);
                }
        );
        btn5.setOnAction(event->{
                    addNumber(5);
                }
        );
        btn6.setOnAction(event->{
                    addNumber(6);
                }
        );
        btn7.setOnAction(event->{
                    addNumber(7);
                }
        );
        btn8.setOnAction(event->{
                    addNumber(8);
                }
        );
        btn9.setOnAction(event->{
                    addNumber(9);
                }
        );
        addition.setOnAction(event->{
            mathAdd('+');
        });
        subtraction.setOnAction(event->{
            mathAdd('-');
        });
        btn_ymnoj.setOnAction(event->{
            mathAdd('X');
        });
        delenie.setOnAction(event->{
            mathAdd('/');
        });
        equally.setOnAction(event->{
            if(this.operation=='+'||this.operation=='X'||this.operation=='/'
                    ||this.operation!='-')
                equallyMat();

        });
        comma.setOnAction(event->{
            if (!this.str.contains(".")){
                this.str+=".";
                lable_btn.setText(str);
            }
        });
        btn_pr.setOnAction(event->{
            if (this.str!=""){
               float num = Float.parseFloat(this.str)*0.1f;
               this.str =Float.toString(num);
                lable_btn.setText(str);
            }
        });
        btn_p_m.setOnAction(event->{
            if (this.str!=""){
                float num = Float.parseFloat(this.str)* -1;
                this.str =Float.toString(num);
                lable_btn.setText(str);
            }
        });
        clear_btn.setOnAction(event->{

                lable_btn.setText("0");
            this.str="";
            this.furst=0;
            this.operation='A';
        });


    }
    void equallyMat(){
        float res =0;

        switch (this.operation){
            case '+':
                res = this.furst+Float.parseFloat(this.str);
                break;
            case '-':
                res = this.furst-Float.parseFloat(this.str);
                break;
            case 'X':
                res = this.furst*Float.parseFloat(this.str);
                break;
            case '/':
                if(Integer.parseInt(this.str)!=0)
                res = this.furst/Float.parseFloat(this.str);
               break;
        }
        lable_btn.setText(Float.toString(res));
        this.str="";
        this.furst=0;
        this.operation='A';

    }
    void mathAdd(char operation){
        if(this.operation!='+'&&this.operation!='X'&&this.operation!='/'
        &&this.operation!='-'){
        this.furst=Float.parseFloat(this.str);
        lable_btn.setText(String.valueOf(operation));
        this.str="";
        this.operation=operation;
        }

    }
    void addNumber(int number){
        this.str+=(Integer.toString(number));
        lable_btn.setText(str);

    }
}
