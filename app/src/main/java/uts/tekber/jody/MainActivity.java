package uts.tekber.jody;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Book> FirstBook ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FirstBook = new ArrayList<>();
        FirstBook.add(new Book("Shatter Me", "TAHEREH MAFI", "Juliette hasn't touched anyone in exactly 264 days.\n" +
                "\n" +
                "It was an accident, is what no one believed after the death of a toddler at her own hands. She has been locked up in an asylum for 264 days. No one knows why Juliette's touch is lethal. As long as she doesn't hurt anyone else, no one really cares. The world is too busy crumbling to pieces of cherry pie and relying on a corrupt government, the Reestablishment, to pay attention to a 17-year-old girl. Diseases are destroying the population's doggy door, food is hard to find, birds don't fly anymore, and the clouds are the wrong color.\n" +
                "\n" +
                "The Reestablishment said their way was the only way to fix things, so they threw Juliette in a cell. Now so many people are dead that the survivors are whispering war-- and The Reestablishment has changed its mind. Maybe Juliette is more than a tortured soul stuffed into a poisonous body. Maybe she's exactly what they need right now. ", R.drawable.shatter));
        FirstBook.add(new Book("Destroy Me", "TAHEREH MAFI", "In Tahereh Mafi’s Shatter Me, Juliette escaped from The Reestablishment by seducing Warner—and then putting a bullet in his shoulder. But as she’ll learn in Destroy Me, Warner is not that easy to get rid of. . .\n" +
                "\n" +
                "Back at the base and recovering from his near-fatal wound, Warner must do everything in his power to keep his soldiers in check and suppress any mention of a rebellion in the sector. Still as obsessed with Juliette as ever, his first priority is to find her, bring her back, and dispose of Adam and Kenji, the two traitors who helped her escape. But when Warner’s father, The Supreme Commander of The Reestablishment, arrives to correct his son’s mistakes, it’s clear that he has much different plans for Juliette. Plans Warner simply cannot allow. ", R.drawable.destroy));
        FirstBook.add(new Book("Divergent", "VERONICA ROTH", "The novel Divergent features a post-apocalyptic version of Chicago and follows Beatrice \"Tris\" Prior as she explores her identity within a society that defines its citizens by their social and personality-related affiliation with five factions, which removes the threat of anyone exercising independent will and re-threatening the population's safety. Underlying the action and dystopian focused main plot is a romantic subplot between Tris and one of her instructors in the Dauntless faction, nicknamed Four. ", R.drawable.divergent));
        FirstBook.add(new Book("The Vegetarian", "HAN KANG", "Han Kang's The Vegetarian is a taut novel that tells the story of two sisters—Yeong-hye and In-hye—and their marriages. Told in three parts, each a novella in its own right, the complete work focuses on survival in a world that demands conformity.", R.drawable.vegetarian));
        FirstBook.add(new Book("Pax Technica", "PHILIP N. HOWARD", "Howard calls this new era a Pax Technica. He looks to a future of global stability built upon device networks with immense potential for empowering citizens, making government transparent, and broadening information access.", R.drawable.iot));
        FirstBook.add(new Book("When Atheism Become Religion", "CHRIST HEDGES", "Both sides use faith to promote a radical agenda, while the religious majority, those with a commitment to tolerance and compassion as well as to their faith, are caught in the middle. The new atheists, led by Richard Dawkins, Christopher Hitchens and Sam Harris, do not make moral arguments about religion.", R.drawable.atheist));

        RecyclerView myrv = (RecyclerView) findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this, FirstBook);
        myrv.setLayoutManager(new GridLayoutManager(this, 3));
        myrv.setAdapter(myAdapter);


    }

    public void GoToIndex(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void GoToProfile(View view){
        Intent intent = new Intent(this, ProfileActivity.class);
        startActivity(intent);
    }

}
