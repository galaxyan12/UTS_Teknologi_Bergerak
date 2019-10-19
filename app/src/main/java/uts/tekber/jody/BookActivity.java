package uts.tekber.jody;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class BookActivity extends AppCompatActivity {

    private TextView tvtitle, tvauthor, tvdescription;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);

        tvtitle = (TextView) findViewById(R.id.txtitle);
        tvauthor = (TextView) findViewById(R.id.txauthor);
        tvdescription = (TextView) findViewById(R.id.txdesc);
        img = (ImageView) findViewById(R.id.bookthumbnail);

        Intent intent = getIntent();
        String Title = intent.getExtras().getString("Book Title");
        String Author = intent.getExtras().getString("Author");
        String Description = intent.getExtras().getString("Description");
        int image = intent.getExtras().getInt("Thumbnail");

        tvtitle.setText(Title);
        tvauthor.setText(Author);
        tvdescription.setText(Description);
        img.setImageResource(image);
    }
}
