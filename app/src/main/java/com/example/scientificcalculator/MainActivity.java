package com.example.scientificcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bSin,bCos,bTan,bac,bc,bb1,bb2,blog,bln,bDiv,bSqrt,bSquare,bFact,bInv,bMin,bPlus,bMul,bEqual,bDot,bpi;
    TextView tvMain,tvSec ;
    String pi= "3.14159265";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);
        b5=findViewById(R.id.b5);
        b6=findViewById(R.id.b6);
        b7=findViewById(R.id.b7);
        b8=findViewById(R.id.b8);
        b9=findViewById(R.id.b9);
        b0=findViewById(R.id.b0);
        bb1=findViewById(R.id.bb1);
        bb2=findViewById(R.id.bb2);
        bac=findViewById(R.id.bac);
        bc=findViewById(R.id.bc);
        bSin=findViewById(R.id.bSin);
        bCos=findViewById(R.id.bCos);
        bTan=findViewById(R.id.bTan);
        blog=findViewById(R.id.blog);
        bln=findViewById(R.id.bln);
        bDiv=findViewById(R.id.bDiv);
        bSqrt=findViewById(R.id.bSqrt);
        bSquare=findViewById(R.id.bSquare);
        bFact=findViewById(R.id.bFact);
        bMin=findViewById(R.id.bMin);
        bpi=findViewById(R.id.bpi);
        bPlus=findViewById(R.id.bPlus);
        bMul=findViewById(R.id.bMul);
        bEqual=findViewById(R.id.bEqual);
        bInv=findViewById(R.id.bInv);
        bDot=findViewById(R.id.bDot);


        tvMain=findViewById(R.id.tvMain);
        tvSec=findViewById(R.id.tvSec);

        //onclickListener

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMain.setText(tvMain.getText()+"1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMain.setText(tvMain.getText()+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMain.setText(tvMain.getText()+"3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMain.setText(tvMain.getText()+"4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMain.setText(tvMain.getText()+"5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMain.setText(tvMain.getText()+"6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMain.setText(tvMain.getText()+"7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMain.setText(tvMain.getText()+"8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMain.setText(tvMain.getText()+"9");
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMain.setText(tvMain.getText()+"0");
            }
        });
        bDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMain.setText(tvMain.getText()+".");
            }
        });
        bac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMain.setText("");
                tvSec.setText("");
            }
        });
        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tvMain.getText().toString();
                val=val.substring(0,val.length()-1);
                tvMain.setText(val);
            }
        });
        bPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMain.setText(tvMain.getText()+"+");
            }
        });
        bMin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMain.setText(tvMain.getText()+"-");
            }
        });
        bMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMain.setText(tvMain.getText()+"*");
            }
        });
        bDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMain.setText(tvMain.getText()+"÷");
            }
        });
        bSqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String val=tvMain.getText().toString();
               double r= Math.sqrt(Double.parseDouble(val));
               tvMain.setText(String.valueOf(r));
            }
        });
        bDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMain.setText(tvMain.getText()+"÷");
            }
        });
        bb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMain.setText(tvMain.getText()+"(");
            }
        });
        bb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMain.setText(tvMain.getText()+")");
            }
        });
        bpi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvSec.setText(bpi.getText());
                tvMain.setText(tvMain.getText()+pi);
            }
        });
        bpi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvSec.setText(bpi.getText());
                tvMain.setText(tvMain.getText()+pi);
            }
        });
        bSin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvSec.setText(bpi.getText());
                tvMain.setText(tvMain.getText()+"sin");
            }
        });
        bCos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvSec.setText(bpi.getText());
                tvMain.setText(tvMain.getText()+"cos");
            }
        });
        bTan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvSec.setText(bpi.getText());
                tvMain.setText(tvMain.getText()+"tan");
            }
        });
        bInv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvSec.setText(bpi.getText());
                tvMain.setText(tvMain.getText()+pi);
            }
        });
        bFact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int val =Integer.parseInt(tvMain.getText().toString());
                int fact=factorial(val);
                tvMain.setText(String.valueOf(fact));
                tvSec.setText(val+"!");

            }
        });
        bSquare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double d=Double.parseDouble(tvMain.getText().toString());
                double square=d*d;
                tvMain.setText(String.valueOf(square));
                tvSec.setText(d+"²");
            }
        });
        bEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String val = tvMain.getText().toString();
                String replacedstr = val.replace('÷','/').replace('×','*');
                double result = eval(replacedstr);
                tvMain.setText(String.valueOf(result));
                tvSec.setText(val);
            }
        });





    }
    //factorial function
    int factorial(int n){
        return (n==1 ||n==0)? 1: n*factorial(n-1);
    }
    public static double eval(final String str) {
        return new Object() {
            int pos = -1, ch;

            void nextChar() {
                ch = (++pos < str.length()) ? str.charAt(pos) : -1;
            }

            boolean eat(int charToEat) {
                while (ch == ' ') nextChar();
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }

            double parse() {
                nextChar();
                double x = parseExpression();
                if (pos < str.length()) throw new RuntimeException("Unexpected: " + (char)ch);
                return x;
            }

            // Grammar:
            // expression = term | expression `+` term | expression `-` term
            // term = factor | term `*` factor | term `/` factor
            // factor = `+` factor | `-` factor | `(` expression `)`
            //        | number | functionName factor | factor `^` factor

            double parseExpression() {
                double x = parseTerm();
                for (;;) {
                    if      (eat('+')) x += parseTerm(); // addition
                    else if (eat('-')) x -= parseTerm(); // subtraction
                    else return x;
                }
            }

            double parseTerm() {
                double x = parseFactor();
                for (;;) {
                    if      (eat('*')) x *= parseFactor(); // multiplication
                    else if (eat('/')) x /= parseFactor(); // division
                    else return x;
                }
            }

            double parseFactor() {
                if (eat('+')) return parseFactor(); // unary plus
                if (eat('-')) return -parseFactor(); // unary minus

                double x;
                int startPos = this.pos;
                if (eat('(')) { // parentheses
                    x = parseExpression();
                    eat(')');
                } else if ((ch >= '0' && ch <= '9') || ch == '.') { // numbers
                    while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                    x = Double.parseDouble(str.substring(startPos, this.pos));
                } else if (ch >= 'a' && ch <= 'z') { // functions
                    while (ch >= 'a' && ch <= 'z') nextChar();
                    String func = str.substring(startPos, this.pos);
                    x = parseFactor();
                    if (func.equals("sqrt")) x = Math.sqrt(x);
                    else if (func.equals("sin")) x = Math.sin(Math.toRadians(x));
                    else if (func.equals("cos")) x = Math.cos(Math.toRadians(x));
                    else if (func.equals("tan")) x = Math.tan(Math.toRadians(x));
                    else if (func.equals("log")) x = Math.log10(x);
                    else if (func.equals("ln")) x = Math.log(x);
                    else throw new RuntimeException("Unknown function: " + func);
                } else {
                    throw new RuntimeException("Unexpected: " + (char)ch);
                }

                if (eat('^')) x = Math.pow(x, parseFactor()); // exponentiation

                return x;
            }
        }.parse();
    }
}