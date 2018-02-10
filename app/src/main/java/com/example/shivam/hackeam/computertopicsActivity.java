package com.example.shivam.hackeam;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class computertopicsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computertopics);

        Button btnlinearsearch,btnbinarysearch,btnbubblesort,btnselectionsort,btninsertionsort,btnstack,btnqueue,btnlinkedlist;

        btnlinearsearch=findViewById(R.id.btnlinearsearch);
        btnbinarysearch=findViewById(R.id.btnbinarysearch);
        btnbubblesort=findViewById(R.id.btnbubblesort);
        btnselectionsort=findViewById(R.id.btnselectionsort);
        btninsertionsort=findViewById(R.id.btninsertionsort);
        btnstack=findViewById(R.id.btnstacks);
        btnqueue=findViewById(R.id.btnqueue);
        btnlinkedlist=findViewById(R.id.btnlinkedlist);

        btnlinearsearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                LayoutInflater li = LayoutInflater.from(computertopicsActivity.this);
                final View promptsView = li.inflate(R.layout.layoutdialog, null);

                AlertDialog.Builder builder=new AlertDialog.Builder(computertopicsActivity.this);
                builder.setView(promptsView);

                Button video=promptsView.findViewById(R.id.button);
                video.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(Intent.ACTION_VIEW , Uri.parse("https://www.youtube.com/watch?v=iwo5WAldDks"));
                        computertopicsActivity.this.startActivity(intent);
                    }
                });

                Button theory=promptsView.findViewById(R.id.THEORY);
                theory.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String url = "https://www.geeksforgeeks.org/linear-search/";
                        Intent i = new Intent();
                        i.setPackage("com.android.chrome");
                        i.setAction(Intent.ACTION_VIEW);
                        i.setData(Uri.parse(url));
                        startActivity(i);
                    }
                });


                Button test=promptsView.findViewById(R.id.test);
                test.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String url = "https://www.hackerearth.com/practice/algorithms/searching/linear-search/practice-problems/";
                        Intent i = new Intent();
                        i.setPackage("com.android.chrome");
                        i.setAction(Intent.ACTION_VIEW);
                        i.setData(Uri.parse(url));
                        startActivity(i);
                    }
                });


                AlertDialog alertDialog = builder.create();
                alertDialog.show();
            }
        });






        btnbinarysearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                LayoutInflater li = LayoutInflater.from(computertopicsActivity.this);
                final View promptsView = li.inflate(R.layout.layoutdialog, null);

                AlertDialog.Builder builder=new AlertDialog.Builder(computertopicsActivity.this);
                builder.setView(promptsView);

                Button video=promptsView.findViewById(R.id.button);
                video.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(Intent.ACTION_VIEW , Uri.parse("https://www.youtube.com/watch?v=j5uXyPJ0Pew"));
                        computertopicsActivity.this.startActivity(intent);
                    }
                });

                Button theory=promptsView.findViewById(R.id.THEORY);
                theory.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String url = "https://www.geeksforgeeks.org/binary-search/";
                        Intent i = new Intent();
                        i.setPackage("com.android.chrome");
                        i.setAction(Intent.ACTION_VIEW);
                        i.setData(Uri.parse(url));
                        startActivity(i);
                    }
                });


                Button test=promptsView.findViewById(R.id.test);
                test.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String url = "https://www.hackerearth.com/practice/algorithms/searching/binary-search/practice-problems/";
                        Intent i = new Intent();
                        i.setPackage("com.android.chrome");
                        i.setAction(Intent.ACTION_VIEW);
                        i.setData(Uri.parse(url));
                        startActivity(i);
                    }
                });


                AlertDialog alertDialog = builder.create();
                alertDialog.show();

            }
        });

        btnbubblesort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                LayoutInflater li = LayoutInflater.from(computertopicsActivity.this);
                final View promptsView = li.inflate(R.layout.layoutdialog, null);

                AlertDialog.Builder builder=new AlertDialog.Builder(computertopicsActivity.this);
                builder.setView(promptsView);

                Button video=promptsView.findViewById(R.id.button);
                video.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(Intent.ACTION_VIEW , Uri.parse("https://www.youtube.com/watch?v=Jdtq5uKz-w4"));
                        computertopicsActivity.this.startActivity(intent);
                    }
                });

                Button theory=promptsView.findViewById(R.id.THEORY);
                theory.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String url = "https://www.geeksforgeeks.org/bubble-sort/";
                        Intent i = new Intent();
                        i.setPackage("com.android.chrome");
                        i.setAction(Intent.ACTION_VIEW);
                        i.setData(Uri.parse(url));
                        startActivity(i);
                    }
                });


                Button test=promptsView.findViewById(R.id.test);
                test.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String url = "https://www.hackerearth.com/practice/algorithms/sorting/bubble-sort/practice-problems/";
                        Intent i = new Intent();
                        i.setPackage("com.android.chrome");
                        i.setAction(Intent.ACTION_VIEW);
                        i.setData(Uri.parse(url));
                        startActivity(i);
                    }
                });


                AlertDialog alertDialog = builder.create();
                alertDialog.show();

            }
        });

        btnselectionsort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                LayoutInflater li = LayoutInflater.from(computertopicsActivity.this);
                final View promptsView = li.inflate(R.layout.layoutdialog, null);

                AlertDialog.Builder builder=new AlertDialog.Builder(computertopicsActivity.this);
                builder.setView(promptsView);

                Button video=promptsView.findViewById(R.id.button);
                video.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(Intent.ACTION_VIEW , Uri.parse("https://www.youtube.com/watch?v=GUDLRan2DWM"));
                        computertopicsActivity.this.startActivity(intent);
                    }
                });

                Button theory=promptsView.findViewById(R.id.THEORY);
                theory.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String url = "https://www.geeksforgeeks.org/selection-sort/";
                        Intent i = new Intent();
                        i.setPackage("com.android.chrome");
                        i.setAction(Intent.ACTION_VIEW);
                        i.setData(Uri.parse(url));
                        startActivity(i);
                    }
                });


                Button test=promptsView.findViewById(R.id.test);
                test.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String url = "https://www.hackerearth.com/practice/algorithms/sorting/selection-sort/practice-problems/";
                        Intent i = new Intent();
                        i.setPackage("com.android.chrome");
                        i.setAction(Intent.ACTION_VIEW);
                        i.setData(Uri.parse(url));
                        startActivity(i);
                    }
                });


                AlertDialog alertDialog = builder.create();
                alertDialog.show();

            }
        });

        btninsertionsort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LayoutInflater li = LayoutInflater.from(computertopicsActivity.this);
                final View promptsView = li.inflate(R.layout.layoutdialog, null);

                AlertDialog.Builder builder=new AlertDialog.Builder(computertopicsActivity.this);
                builder.setView(promptsView);

                Button video=promptsView.findViewById(R.id.button);
                video.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(Intent.ACTION_VIEW , Uri.parse("https://www.youtube.com/watch?v=i-SKeOcBwko"));
                        computertopicsActivity.this.startActivity(intent);
                    }
                });

                Button theory=promptsView.findViewById(R.id.THEORY);
                theory.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String url = "https://www.geeksforgeeks.org/insertion-sort/";
                        Intent i = new Intent();
                        i.setPackage("com.android.chrome");
                        i.setAction(Intent.ACTION_VIEW);
                        i.setData(Uri.parse(url));
                        startActivity(i);
                    }
                });


                Button test=promptsView.findViewById(R.id.test);
                test.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String url = "https://www.hackerearth.com/practice/algorithms/sorting/insertion-sort/practice-problems/";
                        Intent i = new Intent();
                        i.setPackage("com.android.chrome");
                        i.setAction(Intent.ACTION_VIEW);
                        i.setData(Uri.parse(url));
                        startActivity(i);

                    }
                });


                AlertDialog alertDialog = builder.create();
                alertDialog.show();

            }
        });

        btnlinkedlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                LayoutInflater li = LayoutInflater.from(computertopicsActivity.this);
                final View promptsView = li.inflate(R.layout.layoutdialog, null);

                AlertDialog.Builder builder=new AlertDialog.Builder(computertopicsActivity.this);
                builder.setView(promptsView);

                Button video=promptsView.findViewById(R.id.button);
                video.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(Intent.ACTION_VIEW , Uri.parse("https://www.youtube.com/watch?v=NobHlGUjV3g"));
                        computertopicsActivity.this.startActivity(intent);
                    }
                });

                Button theory=promptsView.findViewById(R.id.THEORY);
                theory.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String url = "https://www.geeksforgeeks.org/data-structures/linked-list/";
                        Intent i = new Intent();
                        i.setPackage("com.android.chrome");
                        i.setAction(Intent.ACTION_VIEW);
                        i.setData(Uri.parse(url));
                        startActivity(i);
                    }
                });


                Button test=promptsView.findViewById(R.id.test);
                test.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String url = "https://www.hackerearth.com/practice/data-structures/linked-list/singly-linked-list/practice-problems/";
                        Intent i = new Intent();
                        i.setPackage("com.android.chrome");
                        i.setAction(Intent.ACTION_VIEW);
                        i.setData(Uri.parse(url));
                        startActivity(i);
                    }
                });


                AlertDialog alertDialog = builder.create();
                alertDialog.show();


            }
        });

        btnstack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                LayoutInflater li = LayoutInflater.from(computertopicsActivity.this);
                final View promptsView = li.inflate(R.layout.layoutdialog, null);

                AlertDialog.Builder builder=new AlertDialog.Builder(computertopicsActivity.this);
                builder.setView(promptsView);

                Button video=promptsView.findViewById(R.id.button);
                video.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(Intent.ACTION_VIEW , Uri.parse("https://www.youtube.com/watch?v=F1F2imiOJfk"));
                        computertopicsActivity.this.startActivity(intent);
                    }
                });

                Button theory=promptsView.findViewById(R.id.THEORY);
                theory.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String url = "https://www.geeksforgeeks.org/stack-data-structure/";
                        Intent i = new Intent();
                        i.setPackage("com.android.chrome");
                        i.setAction(Intent.ACTION_VIEW);
                        i.setData(Uri.parse(url));
                        startActivity(i);
                    }
                });


                Button test=promptsView.findViewById(R.id.test);
                test.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String url = "https://www.hackerearth.com/practice/data-structures/stacks/basics-of-stacks/practice-problems/";
                        Intent i = new Intent();
                        i.setPackage("com.android.chrome");
                        i.setAction(Intent.ACTION_VIEW);
                        i.setData(Uri.parse(url));
                        startActivity(i);
                    }
                });


                AlertDialog alertDialog = builder.create();
                alertDialog.show();


            }
        });

        btnqueue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                LayoutInflater li = LayoutInflater.from(computertopicsActivity.this);
                final View promptsView = li.inflate(R.layout.layoutdialog, null);

                AlertDialog.Builder builder=new AlertDialog.Builder(computertopicsActivity.this);
                builder.setView(promptsView);

                Button video=promptsView.findViewById(R.id.button);
                video.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(Intent.ACTION_VIEW , Uri.parse("https://www.youtube.com/watch?v=XuCbpw6Bj1U"));
                        computertopicsActivity.this.startActivity(intent);
                    }
                });

                Button theory=promptsView.findViewById(R.id.THEORY);
                theory.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String url = "https://www.geeksforgeeks.org/queue-data-structure/";
                        Intent i = new Intent();
                        i.setPackage("com.android.chrome");
                        i.setAction(Intent.ACTION_VIEW);
                        i.setData(Uri.parse(url));
                        startActivity(i);
                    }
                });


                Button test=promptsView.findViewById(R.id.test);
                test.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String url = "https://www.hackerearth.com/practice/data-structures/queues/basics-of-queues/practice-problems/";
                        Intent i = new Intent();
                        i.setPackage("com.android.chrome");
                        i.setAction(Intent.ACTION_VIEW);
                        i.setData(Uri.parse(url));
                        startActivity(i);
                    }
                });


                AlertDialog alertDialog = builder.create();
                alertDialog.show();


            }
        });



    }
}
