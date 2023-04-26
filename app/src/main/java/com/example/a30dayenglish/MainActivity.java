package com.example.a30dayenglish;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    HashMap<String, String> hashMap;
    ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView textView = (TextView) this.findViewById(R.id.marqueText);
        textView.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        textView.setText("প্রিয় গ্রাহক অ্যাপটিতে কুইজের মতো নতুন নতুন ফিচার যুক্ত করা হবে তাই নিয়মিত আপডেট চেক করুন।");
        textView.setSelected(true);
        textView.setSingleLine(true);

        listView = findViewById(R.id.listView);

        createTable();
        MyAdapter myAdapter = new MyAdapter();
        listView.setAdapter(myAdapter);


    }
    //wsifhwriufohrewuif
    private class MyAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return arrayList.size();
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            LayoutInflater layoutInflater = getLayoutInflater();
            View myView = layoutInflater.inflate(R.layout.item, parent, false);


            TextView tvTitle = myView.findViewById(R.id.tvTitle);

            HashMap<String, String> hashMap = arrayList.get(position);

            String title = hashMap.get("title");
            String english = hashMap.get("english");


            tvTitle.setText(title);

            myView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
                    intent.putExtra("english", english);
                    startActivity(intent);

                }
            });

            return myView;
        }
    }

    public void createTable() {

        hashMap = new HashMap<>();

        hashMap.put("title", "১ম ক্লাস");
        hashMap.put("english", "প্রথম দিকে আমরা সহজ ইংলিশ গুলা শিখব ওকে, \n" +
                "তারপর ধিরে ধিরে কঠিনের দিকে যাব \uD83D\uDCAA । কঠিন \n" +
                "শব্দটা শুনে ভয় পাবেন্না কিন্তু আমি আপনাদের সাথেই আছি।\n" +
                "আপনাদের জন্য এই অ্যাপ টা কতটা সহজ\n" +
                "করে বানানো হয়েছে  তা প্রথম ক্লাসেই বুঝে যাবেন।\n" +
                "চলুন শুরু করা যাক! - Lets start!\n" +
                "\n" +
                "\n" +
                "\n" +
                "I - (আই) = আমি\n" +
                "\n" +
                "like-(লাইক) = পছন্দ করা।\n" +
                "\n" +
                "you-() = তুমি\n" +
                "\n" +
                "\n" +
                "এবার একসাথে-\n" +
                "♻ I like you-(আই লাইক ইউ) = আমি তোমায় পছন্দ করি।\n" +
                "\n" +
                "\n" +
                "smile-(স্মাইল) = হাসি\n" +
                "\n" +
                "♻I like your smile-(আই লাইক ইয়র স্মাইল) = আমি তোমার হাসি পছন্দ করি।\n" +
                "\n" +
                "\n" +
                "he-(হি) = সে (কোন পুরুষের ক্ষেত্রে)\n" +
                "\n" +
                "she-(শি) = সে (কোন মহিলার ক্ষেত্রে )\n" +
                "\n" +
                "they-(দে) = তারা বা তাহারা\n" +
                "\n" +
                "know-(নো) = জানা\n" +
                "\n" +
                "unknown-(আন নন) = অজানা\n" +
                "\n" +
                "how-(হাও) = কেমন\n" +
                "\n" +
                "are-(আর) = হয়/হই/আছে/কি? এসব অর্থে ব্যাবহার হয়।\n" +
                "\n" +
                "♻How are you?-(হাও আর ইউ?) = তুমি কেমন আছ?\n" +
                "\n" +
                "That means-( দ্যাট মিন্স)  = তার মানে বা যার মানে\n" +
                "\n" +
                "♻are you fine-(আর ইউ ফাইন?) = তুমি ভাল আছ ?\n" +
                "\n" +
                "\n" +
                "****ইয়াহু****\n" +
                "তো বলুন কেমন লাগছে। আশা করি আপনি এনজয় করছেন। " +
                " একটা কথা সবসময় মনে রাখবেন আমরা শুধু চেষ্টা করতে পারি " +
                "বাট সাকছেস দেয়ার মালিক আমাদের প্রভু। যাহোক অল্প অল্প করে " +
                "আগান তারাহুরু করবেন্না। আজ যেটুকু শিখলেন তা practice " +
                "(প্রাকটিস) = অনুশিলন করুন বেশি বেশি । নিজে নিজে বা আয়নার সামনে " +
                "যেভাবে পারেন করুন। বাট বাদ দিবেন না প্লিজ, মনের মধ্যে গেথে নিন যে,  " +
                "আপনি যে করেই হোক ইংরেজি শিখবেনি শিখবেন। \uD83D\uDCAA\n" +
                "\n" +
                "\uD83E\uDD70**********শুভকামনা***********\uD83E\uDD70 ");

        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("english", "হ্যালো !! আপনাকে দ্বিতীয় ক্লাস এ দেখে সত্যিই ভালো লাগছে \uD83E\uDD70, আপনি ক্লাস গুলো আসলেই ইঞ্জয় করছেন। তো চলুন ২য় ক্লাস শুরু করি- \uD83D\uDCAA\uD83D\uDC49 \n" +
                "\n" +
                "\n" +
                "\n" +
                "am-(অ্যাম) = হই/হয়/আছে এসব অর্থে ব্যাবহার হয়। \n" +
                "\n" +
                "fine-(ফাইন) = ভালো \n" +
                "\n" +
                "♻ I am fine-(আই অ্যাম ফাইন ) = আমি ভালো আছি। \n" +
                "\n" +
                "and-(অ্যান্ড) =  এবং \n" +
                " \n" +
                "And you?-(অ্যান্ড ইউ?) = আর তুমি / এবং তুমি?\n" +
                "\n" +
                "also-(অলসো) = ও \n" +
                "\n" +
                "♻ I am also fine-(আই অ্যাম অলসো ফাইন) = আমিও ভালো আছি। \n" +
                "\n" +
                "is-(ইজ) = হয় \n" +
                "\n" +
                "not-(নট) = না\n" +
                "\n" +
                "bad-(ব্যাড) =  খারাপ\n" +
                "\n" +
                "♻ He is not bad-(হি ইজ নট ব্যাড) =  সে খারাপ না।\n" +
                " \n" +
                "bed-(বেড) = বিছানা\n" +
                "\n" +
                "this-(দিস) = এটা / ইহা \n" +
                "\n" +
                "my-(মাই) = আমার \n" +
                "\n" +
                "♻ This is my bed-(দিস ইজ মাই বেড) = এটা আমার বিছানা।\n" +
                "\n" +
                "what-(হুয়াট) = কি? \n" +
                "\n" +
                "do-(ডু) = করা\n" +
                "\n" +
                "you-(ইউ) = তুমি \n" +
                "\n" +
                "mean-(মিন) = মানে বা অর্থ। \n" +
                "\n" +
                "♻ What do you mean?-(হুয়াট ডু ইউ মিন?) = তুমি কি বুঝাতে চাও? \n" +
                "\n" +
                "\n" +
                "                ***** অসাধারণ ***** \n" +
                " আজ যা যা শিখলেন তা আপনার চলাফেরায় ব্যাবহার করুন। কালকের ক্লাস করতে ভুলবেন না যেন.. \n" +
                "\n" +
                "  \n" +
                "\n" +
                "\n");
        hashMap.put("title", "২য় ক্লাস");
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("english", "স্বাগতম আপনাকে ৩য় ক্লাস এ চলুন শুরু করি- \n" +
                "\n" +
                "\n" +
                "have-(হ্যাভ) =আছে \n" +
                "\n" +
                "nothing- (নাথিং) = কিছুনা \n" +
                "\n" +
                "to-(টু) = প্রতি বা দিকে \n" +
                "\n" +
                "say-(ছে) = বলা \n" +
                "\n" +
                "♻I have nothing to say-(আই হ্যাভ নাথিং টু ছে) = আমার কিছু বলার নেই। \n" +
                "\n" +
                "\n" +
                "can-(ক্যান) = পারা \n" +
                "\n" +
                "share-(শেয়ার) = ভাগাভাগি করা \n" +
                "\n" +
                "me-(মি) = আমি (নিজেকে বোঝায়) \n" +
                "\n" +
                "problem-(প্রব্লেম) = সমস্যা \n" +
                "\n" +
                "♻You can share your problem with me-(ইউ ক্যান শেয়ার ইউর প্রব্লেম উইথ মে) = তুমি তোমার সমস্যা আমার সাথে শেয়ার করতে পার। \n" +
                "\n" +
                "\n" +
                "I mean-(আই মিন) =  আমি বুঝাতে চাই \n" +
                "\n" +
                "♻I mean I am not ok - (আই মিন আই অ্যাম নট ওকে) = আমি বুঝাতে চাচ্ছি আমি ভালো নেই। \n" +
                "\n" +
                "\n" +
                "listen-(লিছেন) = শোনা \n" +
                "\n" +
                "♻listen to me-(লিছেন টু মি) = আমার কথা শোন। \n" +
                "\n" +
                "please-(প্লিজ) = দয়া করে \n" +
                "\n" +
                "♻please listen-(প্লিজ লিছেন) = দয়া করে কথা শোন। \n" +
                "\n" +
                "can- (ক্যান) = পারা \n" +
                "\n" +
                "♻can I help you?- (ক্যান আই হেল্প ইউ?) = আমি কি তোমাকে সাহায্য করতে পারি? \n" +
                "\n" +
                "\n" +
                "♻thanks a lot-(থ্যাঙ্কস আ লট) = অনেক ধন্যবাদ। \n" +
                "\n" +
                "♻how to make a home?- (হাও টু মেক আ হোম?) = কিভাবে একটি বাড়ি বানাতে হয়। \n" +
                "\n" +
                "curry- (কারি) = তরকারি \n" +
                "\n" +
                "cook-() = রান্না \n" +
                "\n" +
                "♻how to cook fish curry-(হাও টু কুক ফিশ কারি) = কিভাবে মাছের তরকারি রান্না করা জায় \n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\t\t******************সমাপ্ত****************\n" +
                "\tবেশি বেশি practice করুন আজ অনেক গুলো শব্দ ও বাক্য শিখলেন।\n" +
                "\t\tএকদিনে মাত্র একটি ক্লাস করা সবচেয়ে উত্তম হবে।\n" +
                "\n" +
                "\n" +
                "\n");
        hashMap.put("title", "৩য় ক্লাস");
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("english", "তো শুরু করা যাক  আমাদের ৪তম ক্লাস -\n" +
                "\n" +
                "\n" +
                "\n" +
                "how- (হাও) = কেমন \n" +
                "\n" +
                "help- (হেল্প) = সাহায্য \n" +
                "\n" +
                "♻how can I help you?- (হাও ক্যান আই হেল্প ইউ?) = আমি আপনাকে কিভাবে সাহায্য করতে পারি?\n" +
                "\n" +
                "\n" +
                "tell- ( টেল) = বলা \n" +
                "\n" +
                "♻tell me, what's your problem- (টেল মি , হুয়াট'স ইউর প্রব্লেম?) = আমাকে বল, তোমার সমস্যা কি? \n" +
                "\n" +
                "\n" +
                "some- (সাম) = কিছু \n" +
                "\n" +
                "♻I have some problems- (আই হ্যাভ সাম প্রব্লেম) = আমার কিছু সমস্যা আছে। \n" +
                "\n" +
                "\n" +
                "♻I will call you- (আই উইল কল ইউ) = আমি তোমাকে কল করব বা ডাকবো \n" +
                "\n" +
                "\n" +
                "later- (লেটার) = পরে \n" +
                "\n" +
                "letter- (লেটার) এই লেটার মানে চিঠি  ,বানান মনে রাখবেন।\n" +
                "\n" +
                "♻I will call you later- (আই উইল কল ইউ লেটার ) = আমি তোমাকে পরে ডাকবো বা কল করব।\n" +
                "\n" +
                "\n" +
                "tomorrow - (টু মরো) =  আগামিকাল \n" +
                "\n" +
                "♻I will call you tomorrow - (আই উইল কল ইউ টু মরো) = আমি তোমাকে আগামিকাল কল করব। \n" +
                "\n" +
                "\n" +
                "♻I will call you back- (আই উইল কল ইউ ব্যাক) = আমি তোমাকে নিজে ফেরত কল করব \n" +
                "\n" +
                "\n" +
                "sleep- (স্লিপ) = ঘুমান \n" +
                "\n" +
                "now-  (নাও) = এখন \n" +
                "\n" +
                "♻I will go to sleep- (আই উইল গো টু স্লিপ) = আমি ঘুমাতে যাব। \n" +
                "\n" +
                "\n" +
                "let- (লেট) = দেয়া \n" +
                "\n" +
                "finish- (ফিনিশ) = শেষ করা    (খতম টাটা বায় বায় \uD83D\uDE01)\n" +
                "\n" +
                "♻Let me finish- (লেট মি ফিনিশ) = আমাকে শেষ করতে দাও। \n" +
                "\n");

        hashMap.put("title", "৪তম ক্লাস");
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("english", "চলুন শুরু করি আমাদের ৫ম ক্লাস-\n" +
                "\n" +
                "\n" +
                "\n" +
                "why- (হুয়াই) = কেন? \n" +
                "\n" +
                "go- (গো) = যাওয়া \n" +
                "\n" +
                "going- (গোয়িং) = যাচ্ছ বা যাচ্ছি\n" +
                "\n" +
                "♻ why you are going?- (হুয়াই ইউ আর গোয়িং) = তুমি চলে যাচ্ছ কেন? \n" +
                "\n" +
                "\n" +
                "wait- (ওয়েট) = অপেক্ষা\n" +
                "\n" +
                "come- (কাম) = আসা \n" +
                "\n" +
                "soon- (ছুন) = শিঘ্রই \n" +
                "\n" +
                "♻ Wait I'm coming soon- (ওয়েট আই অ্যাম কামিং ছুন) = অপেক্ষা কর আমি জলদি আসছি। \n" +
                "\n" +
                "okay- (ওকে) = ঠিক আছে \n" +
                "\n" +
                "♻ok you can go- (ওকে ইউ ক্যান গো ) = ঠিক আছে  তুমি যেতে  পার।\n" +
                "\n" +
                "information- (ইনফরমেশন) = তথ্য \n" +
                "\n" +
                "♻ give me your information- (গিভ মি ইউর ইনফরমেশন) = আমাকে তোমার তথ্য দাও। \n" +
                "\n" +
                "but- (বাট) = কিন্তু \n" +
                "\n" +
                "it- (ইট) = এটা/ ইহা \n" +
                "\n" +
                "remember- (রিমেম্বার) = মনে রাখা \n" +
                "\n" +
                "♻ But remember it- (বাট রিমেম্বার ইট ) = কিন্তু এটা মনে রেখ \n" +
                "\n" +
                "profession- (প্রফেশন) = পেশা \n" +
                "\n" +
                "♻ what is your profession?- (হুয়াট ইজ ইউর প্রফেশন?) = তোমার পেশা কি? \n" +
                "\n" +
                "do- (ডু) = করা \n" +
                "  \n" +
                "don't- (ডোন্ট) =  করিওনা / না করা\n" +
                "\n" +
                " \n" +
                "♻ Do you know English?- (ডু ইউ নো ইংলিশ?) = তুমি কি ইংরেজী জান?  \n" +
                "\n" +
                "\n" +
                "    \t\t\uD83D\uDCAA****ফিনিশ****\uD83D\uDCAA");
        hashMap.put("title", "৫ম ক্লাস");
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("english", "\n" +
                "\n" +
                "চলুন শুরু করি আমাদের ৬তম ক্লাস- \n" +
                "\n" +
                "\n" +
                "well- (ওয়েল) = ভালো \n" +
                "\n" +
                "dear- (ডেয়ার ) = প্রিয় \n" +
                "\n" +
                "need- (নিড) = প্রয়োজন \n" +
                "\n" +
                "friend- (ফ্রেন্ড) = বন্ধু \n" +
                "\n" +
                "now- (নাও) = এখন \n" +
                "\n" +
                "Ok dear friend , I need to go now- (ওকে ডেয়ার ফ্রেন্ড , আই নিড টু গো নাও) = ঠিক আছে প্রিয় বন্ধু , আমার এখন যাওয়া দরকার। \n" +
                "\n" +
                "would you- (উড ইউ) = তুমি কি \n" +
                "\n" +
                "would you like to play?- (উড ইউ লাইক টু প্লে) = তুমি কি খেলতে চাও?  \n" +
                "\n" +
                "\n" +
                "would you like to come?- (উড ইউ লাইক টু কাম ) = তুমি কি আসতে চাও? \n" +
                "\n" +
                "\n" +
                "would you like to go?- (উড ইউ লাইক টু গো) = তুমি কি যেতে চাও? \n" +
                "\n" +
                "\n" +
                "would you like to say something?- (উড ইউ লাইক টু সে সামথিং) = তুমি কি কিছু বলতে চাও? \n" +
                "\n" +
                "\n" +
                "breakfast- (ব্রেকফাস্ট) = সকালের নাস্তা \n" +
                "\n" +
                "Have you breakfast?- (হ্যাভ ইউ ব্রেকফাস্ট) = তুমি কি সকালের নাস্তা করেছ? \n" +
                "\n" +
                "careful- (কেয়ারফুল) = সাবধান \n" +
                "\n" +
                "should be- (শুড বি) = হওয়া উচিত \n" +
                " \n" +
                "Now you should be careful- (নাও ইউ শুড বি কেয়ারফুল) = এখন তোমার সাবধান হওয়া উচিত। \n" +
                "\n" +
                "\n" +
                "consider- (কন্সিডার) = বিবেচনা \n" +
                "\n" +
                "you should be consider- (ইউ শুড বি কন্সিডার ) = তোমার বিবেচনা করা উচিত। \n" +
                "\n");
        hashMap.put("title", "৬তম ক্লাস");
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("english", "\n" +
                "চলুন শুরু করি ৭ম ক্লাস- \n" +
                "\n" +
                "\n" +
                "ask- (আস্ক) = জিজ্ঞাসা \n" +
                "\n" +
                "why- (হুয়াই) = কেন \n" +
                "\n" +
                "silent- (সাইলেন্ট) = চুপ থাকা \n" +
                "\n" +
                "why you ask me- (হুয়াই ইউ আস্ক মি) = তুমি আমাকে কেন জিজ্ঞাসা করছ?\n" +
                "\n\n" +
                "why you are sad- (হুয়াই ইউ আর স্যাড) = তোমার মন খারাপ কেন? \n" +
                "\n\n" +
                "why you are silent- (হুয়াই ইউ আর সাইলেন্ট) = তুমি চুপ করে আছ কেন ? \n" +
                "\n\n" +
                "we- (উই) = আমরা \n" +
                "\n" +
                "confirm- (কনফার্ম) = নিশ্চিত করা \n" +
                "\n" +
                "cross- (ক্রস) = অতিক্রম করা / পার করা \n" +
                "\n" +
                "limit- (লিমিট) = সীমানা / পরিমান \n" +
                "\n" +
                "you are crossing your limit- (ইউ আর ক্রসিং ইউর লিমিট) = তুমি তোমার সীমা ছাড়িয়ে যাচ্ছ..\n" +
                "\n\n" +
                "you are welcome- (ইউ আর ওয়েলকাম) = তোমাকে স্বাগতম \n" +
                "\n" +
                "beautiful- (বিউটিফুল) = সুন্দর \n" +
                "\n" +
                "you are so beautiful- (ইউ আর সো বিউটিফুল) = তুমি অনেক সুন্দর \n" +
                "\n" +
                "confidence- (কনফিডেন্স) = আত্মবিশ্বাস \n" +
                "\n" +
                "I have high confidence- (আই হ্যাভ হাই কনফিডেন্স) = আমার অনেক আত্মবিশ্বাসী। \n" +
                "\n\n" +
                "I don't know- (আই ডোন্ট নো) = আমি জানিনা \n" +
                "\n\n" +
                "forget- (ফরগেট) = ভুলে যাওয়া / হারানো \n" +
                "\n\n" +
                "never- (নেভার) = কখনো না \n" +
                "\n" +
                "I never forget you- (আই নেভার ফরগেট ইউ) = আমি তোমাকে কখনো ভুলব না  \n" +
                "\n\n" +
                "I never give up- (আই নেভার গিভ আপ) = আমি কখনো হার মানব না \n" +
                "\n\n" +
                "\n" +
                "   **** দেখতে দেখতে  আপনি ৭টি ক্লাস করে ফেলেছেন*****\n" +
                "\t******আশা করছি নিয়মিত অনুশিলন করছেন*****\n" +
                "\t\t********* এগিয়ে যান \uD83E\uDD70\uD83D\uDCAA*********\n" +
                "\n");
        hashMap.put("title", "৭ম ক্লাস");
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("english", "তো চলুন শুরু করা যাক  ৮ম ক্লাস- \uD83D\uDCAA\n" +
                "\n" +
                "\n" +
                "thought- (থট) = ভাবা/ ভেবেছিলাম/ চিন্তা করেছিলাম \n" +
                "\n" +
                "I never thought- (আই নেভার থট) = আমি কখনো ভাবিনি \n" +
                "\n" +
                "had- (হ্যাড) = ছিল \n" +
                "\n" +
                "I never had- (আই নেভার হ্যাড ) = আমার কখনো ছিলনা \n" +
                "\n" +
                "hair- (হেয়ার) = চুল \n" +
                "\n" +
                "hear- (হেয়ার) = শোনা (hair এবং hear এই দুইটা আলাদা মনে রাখবেন)\n" +
                "\n" +
                "I never heard- (আই নেভার হেয়ার'ড) = আমি কখনো শুনিনি \n" +
                "\n" +
                "don't mind- (ডোন্ট মাইন্ড) = কিছু মনে করবেন না\n" +
                "\n" +
                "opportunity- (অপারচুনিটি) = সুযোগ\n" +
                "\n" +
                "big- (বিগ) = বড় \n" +
                "\n" +
                "It's a big opportunity for you- (ইটছ আ বিগ অপারচুনিটি ফর ইউ ) = এটা তোমার জন্য একটি বড় সুযোগ\n" +
                "\n" +
                "\n" +
                "I don't know English well- (আই ডোন্ট নো ইংলিশ ওয়েল) = আমি ভালো ইংরেজি জানিনা\n" +
                "\n" +
                "enough- (এনাফ) = যথেষ্ট\n" +
                "\n" +
                "You know enough English- (ইউ নো এনাফ ইংলিশ) = তুমি যথেষ্ট ইংরেজি জান\n" +
                "\n" +
                "about- (অ্যা বাউট) = বিষয়ে\n" +
                "\n" +
                "about it- (অ্যা বাউট ইট) = এই বিষয়ে\n" +
                "\n" +
                "We need to confirm about it- (উই নিড টু কনফার্ম অ্যা বাউট ইট) = আমাদের এ বিষয়ে নিশ্চিত হওয়া দরকার।\n" +
                "\n");
        hashMap.put("title", "৮ম ক্লাস");
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("english", "তো চলুন শুরু করি  ৯ম ক্লাস-\n" +
                "\n" +
                "\n" +
                "most- (মোস্ট) = অধিক \n" +
                "\n" +
                "you are most welcome- (ইউ আর মোস্ট ওয়েলকাম) = তোমাকে অনেক শুভেচ্ছা\n" +
                "\n" +
                "\n" +
                "some- (ছাম) =  কিছু \n" +
                "\n" +
                "work- (ওয়ার্ক) = কাজ \n" +
                "\n" +
                "in- (ইন) = ভিতরে / মধ্যে \n" +
                "\n" +
                "home- (হোম) =  বাড়ি\n" +
                "\n" +
                "Because- (বিকজ) = কারন\n" +
                "\n" +
                "I have- (আই হ্যাভ) = আমার আছে\n" +
                "\n" +
                "Because I have some work at my home- (বিকজ আই হ্যাভ সাম ওয়ার্ক অ্যাট মাই হোম) = কারন বাড়ীতে আমার কিছু কাজ আছে।\n" +
                "\n" +
                "\n" +
                "bye- (বায়) = বিদায়\n" +
                "\n" +
                "Ok dear, bye- (ওকে ডেআর, বায়) =  ঠিক আছে প্রিয়, বিদায়\n" +
                "\n" +
                "\n" +
                "see- (সি) = দেখা \n" +
                "\n" +
                "again- (এগেইন) =  পুনরায় / আবার \n" +
                "\n" +
                "Ok see you again- (ওকে সি ইউ এগেইন) = ঠিক আছে তোমার সাথে আবার দেখা হবে\n" +
                "\n" +
                "\n" +
                "myself- (মাইসেলফ) = আমি নিজে\n" +
                "\n" +
                "teacher- (টিচার) = শিক্ষক \n" +
                "\n" +
                "primary- (প্রাইমারি) = প্রাথমিক \n" +
                "\n" +
                "school- (স্কুল) = বিদ্যালয়\n" +
                "\n" +
                "primary school teacher- (প্রাইমারি স্কুল টিচার ) = প্রাথমিক বিদ্যালয়ের শিক্ষক।\n" +
                "\n");
        hashMap.put("title", "৯ম ক্লাস");
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("english", "\n" +
                "\n" +
                "তো চলুন শুরু করা যাক ১০ম ক্লাস-\uD83D\uDCAA\n" +
                "\n" +
                "\n" +
                "\n" +
                "selfish -(সেলফিশ) = স্বার্থপর \n" +
                "\n" +
                "you are a selfish-(ইউ আর আ সেলফিশ) = তুমি একটা স্বার্থপর\n" +
                "\n" +
                "\n" +
                "boat-(বোট) = নৌকা \n" +
                "\n" +
                "boat man-(বোট ম্যান) = নৌকার মাঝি\n" +
                "\n" +
                "world-(ওয়ার্ল্ড) = পৃথিবী\n" +
                "\n" +
                "world class-(ওয়ার্ল্ড ক্লাস) = বিশ্বমানের \n" +
                "\n" +
                "world famous-(ওয়ার্ল্ড ফেমাস) = বিশ্ববিখ্যাত\n" +
                "\n" +
                "perfect solution-(পারফেক্ট সলুশন) = নিখুত সমাধান\n" +
                "\n" +
                "\n" +
                "tell-( টেল) = বলা \n" +
                "\n" +
                "tell me-(টেল মে) = আমাকে বল\n" +
                "\n" +
                "tell me your address-(টেল মে ইউর অ্যাড্রেস) = আমাকে তোমার ঠিকানা বল\n" +
                "\n" +
                "\n" +
                "I will go your home-(আই উইল গো ইউর হোম) = আমি তোমার বাড়ীতে যাব\n" +
                "\n" +
                "\n" +
                "Because I need a solution-(বিকজ আই নিড আ সলুশন) = কারন আমার একটা সমাধান দরকার \n" +
                "\n" +
                "\n" +
                "here- (হেয়ার) = এখানে\n" +
                "\n" +
                "are you here-(আর ইউ হেয়ার) = তুমি কি এখানে আছ? \n" +
                "\n" +
                "\n" +
                "yeah I'm listening-(ইয়াহ আই এম লিছনিং) = হ্যাঁ আমি শুনছি \n" +
                "\n" +
                "\n" +
                "you can tell -( ইউ ক্যান টেল) = তুমি বলতে পার\n" +
                "\n" +
                "\n" +
                "hi mom-(হায় মম) = হায় মা\n" +
                "\n" +
                "under-(আন্ডার) = নিচে / অধিনে\n" +
                "\n" +
                "under the tree-(আন্ডার দা ট্রি) = গাছের নিচে\n" +
                "\n" +
                "\n" +
                "worker-(ওয়ার্কার) = কর্মী / শ্রমিক \n" +
                "\n" +
                "The workers are working under me-(দা ওয়ার্কার্স আর অয়ারকিং আন্ডার মি) = শ্রমিকগুলো আমার অধিনে কাজ করছে\n" +
                "\n");
        hashMap.put("title", "১০ম ক্লাস");
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("english", "\n" +
                "\n" +
                "তো চলুন শুরু করা যাক ১১ তম ক্লাস-\uD83D\uDCAA \n" +
                "\n" +
                "\n" +
                "\n" +
                "let him know-(লেট হিম নো) = তাকে জানতে দাও \n" +
                "\n" +
                "let me finish-(লেট মি ফিনিশ) = আমাকে শেষ করতে দাও \n" +
                "\n" +
                "let me see-(লেট মি সি) = আমাকে দেখতে দাও \n" +
                "\n" +
                "where you are going?-(হয়ার ইউ আর গোয়িং) = তুমি কোথায় যাচ্ছ?\n" +
                "\n" +
                "\n" +
                "afraid-(এফ্রেইড) = ভয় \n" +
                "\n" +
                "don't be afraid-(ডোন্ট বি এফ্রেইড) = ভয় পাবেন না\n" +
                " \n" +
                "I am always with you-(আই অ্যাম অল অয়েস উইথ ইউ) = আমি সবসময় আপনার সাথে আছি\n" +
                "\n" +
                "\n" +
                "there was some distance-(দেয়ার ওয়াজ সাম ডিসটেন্স) = সেখানে কিছু দূরত্ব ছিল \n" +
                "\n" +
                "\n" +
                "wear-(ওয়্যার) = পরিধান করা / পরা \n" +
                "\n" +
                "wear this shirt-(ওয়্যার দিস শার্ট) = এই শার্ট টি পর \n" +
                "\n" +
                "stand-(স্ট্যান্ড) = দাঁড়ানো\n" +
                "\n" +
                "way-(ওয়ে) = পথ / রাস্তা\n" +
                "\n" +
                "I'm standing on the way-(আই এম স্ট্যান্ডিং অন দা ওয়ে) = আমি রাস্তায় দাঁড়িয়ে ছিলাম \n" +
                "\n" +
                "\n" +
                "I am in love with you-(আই এম ইন লাভ উইথ ইউ) = আমি তোমাকে ভালবেসে ফেলেছি \n" +
                "\n" +
                "\n" +
                "I am interested-(আই এম ইন্টারেস্টেড) = আমি আগ্রহী \n" +
                "\n" +
                "where-(হয়ার) = কোথায় \n" +
                "\n" +
                "dad/father-(ডেড / ফাদার) = বাবা / পিতা \n" +
                "\n" +
                "where is dad?-(হয়ার ইজ ডেড) = বাবা কোথায়?\n" +
                "\n" +
                "watch- (ওয়াচ) = দেখা (মনে রাখবেন ওয়াচ মানে অনেকক্ষণ যাবত দেখা আর see সি মানে তাকান)\n" +
                "\n" +
                "\n" +
                "He is watching TV-(হি ইজ ওয়াচ ইং টিভি ) = সে টিভি দেখছে\n" +
                "\n" +
                "very-(ভেরি) = খুব \n" +
                "\n" +
                "hungry-(হাংরি) = ক্ষুধার্ত \n" +
                "\n" +
                "I am very hungry now-(আই এম ভেরি হাংরি) = আমার এখন খুব ক্ষুধা পেয়েছে \n" +
                "\n" +
                "\n");
        hashMap.put("title", "১১তম ক্লাস");
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("english", "\n" +
                "\n" +
                "তো চলুন শুরু করা যাক ১২ তম ক্লাস-\uD83D\uDCAA  \n" +
                "\n" +
                "\n" +
                "\n" +
                "eat- (ইট) = খাওয়া \n" +
                "\n" +
                "let me eat- (লেট মি ইট) = আমাকে খেতে দাও  \n" +
                "\n" +
                "busy- (বিজি) = ব্যাস্ত \n" +
                "\n" +
                "call- (কল) = কল / ডাকা \n" +
                "\n" +
                "wife- (ওয়াইফ) = স্ত্রী \n" +
                "\n" +
                "I am busy now- (আই এম বিজি নাও) = আমি এখন ব্যাস্ত আছি। \n" +
                "\n" +
                "you can call your wife- (ইউ ক্যান কল ইউর ওয়াইফ) = তুমি তোমার স্ত্রীকে কল করতে পার \n" +
                "\n" +
                "She is free now- (শি ইজ ফ্রী নাও) = সে এখন ফ্রী আছে \n" +
                "\n" +
                "Mina..! where are you?- (মিনা , হয়ার আর ইউ?) = মিনা তুমি কোথায় ?\n" +
                "\n" +
                "come- (কাম) = আসো \n" +
                "\n" +
                "here- (হেয়ার) = এখানে\n" +
                "\n" +
                "come here- (কাম হেয়ার) = এখানে আসো \n" +
                "\n" +
                "give- (গিভ) = দেয়া \n" +
                "\n" +
                "were- (ওয়্যার) = ছিল \n" +
                "\n" +
                "Where were you?- (হয়ার অয়ার ইউ?) = তুমি কোথায় ছিলে ? \n" +
                "\n" +
                "long- (লং) = লম্বা \n" +
                "\n" +
                "time- (টাইম) = সময় \n" +
                "\n" +
                "Where were you for a long time?- (হয়ার অয়ার ইউ ফর আ লং টাইম?) = এত লম্বা সময় ধরে তুমি কোথায় ছিলে? \n" +
                "\n" +
                "\n");
        hashMap.put("title", "১২তম ক্লাস");
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("english", "\n" +
                "\n" +
                "তো চলুন শুরু করা যাক ১৩ তম ক্লাস-\uD83D\uDCAA   \n" +
                "\n" +
                "\n" +
                "\n" +
                "that- (দ্যাট) = যে, \n" +
                "\n" +
                "for you- (ফর ইউ) = তোমার জন্য \n" +
                "\n" +
                "do you know that I'm waiting for you?- (ডু ইউ নো দ্যাট আই এম ওয়েটিং ফর ইউ?) =  তুমি কি জানো আমি তোমার জন্য অপেক্ষা করছি। \n" +
                "\n" +
                "\n" +
                "sorry- (সরি) = দুঃখিত \n" +
                "\n" +
                "I'm sorry for that- (আই এম সরি ফর দ্যাট) = আমি সেজন্য দুঃখিত। \n" +
                "\n" +
                "actually- (একচুয়ালি) = আসলে \n" +
                "\n" +
                "actually, I was busy- (একচুয়ালি, আই ওয়াজ বিজি) = আসলে আমি ব্যাস্ত ছিলাম।\n" +
                "\n" +
                "It's okay- (ইট'স ওকে) = ঠিক আছে \n" +
                "\n" +
                "after- (আফটার) = পরে \n" +
                "\n" +
                "sometimes- (সামটাইম'স) = কিছুক্ষন / কখনো \n" +
                "\n" +
                "after some time- (আফটার সামটাইম) = কিছুক্ষন পরে \n" +
                "\n" +
                "What are you doing- (হুয়াট আর ইউ ডু ইং) = তুমি কি করছ? \n" +
                "\n" +
                "tell first- (টেল ফার্স্ট) = প্রথমে বল  / আগে বল \n" +
                "\n" +
                "tell me first, that where you went today- (টেল মি ফার্স্ট হয়ার ইউ ওয়েন্ট টুডে) = আগে বল তুমি আজ কোথায় গিয়েছিলে? \n" +
                "\n" +
                "\n" +
                "week- (উইক) = সপ্তাহ \n" +
                "\n" +
                "within four weeks- (উইথ ইন ফোর উইক'স) = চার সপ্তাহের মধ্যে \n" +
                "\n" +
                "weak- (উইক) = দুর্বল \n" +
                "\n" +
                "He is very weak- (হি ইজ ভেরি উইক) = সে খুব দুর্বল \n" +
                "\t\n" +
                "\t\t\n");
        hashMap.put("title", "১৩তম ক্লাস");
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("english", "\n" +
                "\n" +
                "তো চলুন শুরু করি ১৪তম ক্লাস \uD83D\uDCAA এ পর্যন্ত ক্লাস গুলো করে আশা করছি আপনার ইংরেজির দক্ষতা বৃদ্ধি পাচ্ছে, আর এর মধ্যেই আমাদের কষ্ট সার্থক। প্লে স্টোরে  একটা ৫ স্টার রিভিউ আর আপনার মতামত  আপনার কাছ থেকে প্রত্যাশা করতেই পারি । \uD83E\uDD70\n" +
                "\n" +
                "\n" +
                "\n" +
                "let's talk in English- (লেট'স টক ইন ইংলিশ) = চলুন ইংরজিতে কথা বলা যাক \n" +
                "\n" +
                "let's go to the store- (লেট'স গো টু দা স্টোর) = চলুন দোকানে যাই\n" +
                "\n" +
                "now let's go- (নাও লেট'স  গো) = এখন যাওয়া যাক \n" +
                "\n" +
                "we need to brush our teeth every day- (উই নিড টু ব্রাশ আওয়ার টিথ এভ্রি ডে ) = আমাদের প্রতিদিন দাত মাজা দরকার \n" +
                "\n" +
                "what are you doing now?- (হুয়াট আর ইউ ডু ইং নাও ) = তুমি এখন কি করছ? \n" +
                "\n" +
                "so- (সো) = অতএব / তাই \n" +
                "\n" +
                "therefore- (দেয়ার ফর) = অতএব / সুতরাং \n" +
                "\n" +
                "keep it - (কিপ ইট) = এটা রাখ\n" +
                "\n" +
                "take it- (টেক ইট) = এটা নাও \n" +
                "\n" +
                "I went to my friend's- (আই ওয়েন্ট টু মাই ফ্রেন্ডস) = আমি আমার বন্ধুর কাছে গিয়েছিলাম \n" +
                "\n" +
                "meet- (মিট) = সাক্ষাৎ / দেখা করা \n" +
                "\n" +
                "him- (হিম) = তার / তাকে \n" +
                "\n" +
                "to meet with him- (টু মিট উইথ হিম) =  তার সাথে দেখা করার জন্য \n" +
                "\n" +
                "\n");
        hashMap.put("title", "১৪তম ক্লাস");
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("english", "\n" +
                "আজ আমাদের কত নাম্বার ক্লাস জানি.. হুম ১৫ তম.. সো চলুন শুরু করি \uD83D\uDCAA\n" +
                "\n" +
                "\n" +
                "important- (ইম্পরট্যান্ট) = গুরুত্বপূর্ণ \n" +
                "\n" +
                "it was important- (ইট অজ ইম্পরট্যান্ট) = এটা গুরুত্বপূর্ণ ছিল \n" +
                "\n" +
                "just - (জাস্ট) = শুধু / মাত্র \n" +
                "\n" +
                "only- (অনলি) = মাত্র \n" +
                "\n" +
                "it wasn't just important, it was very important- (ইট অজএন'ট জাস্ট ইম্পরট্যান্ট, ইট অজ ভেরি ইম্পরট্যান্ট) = এটা শুধু গুরুত্বপূর্ণ ছিলোনা, এটা অনেক গুরুত্বপূর্ণ ছিল \n" +
                "\n" +
                "\n" +
                "confusion- (কনফিউশন) = দ্বিধাদ্বন্দ্ব / সন্দেহ\n" +
                "\n" +
                "I was in confusion- (আই অজ ইন কনফিউশন) = আমি দ্বিধাদ্বন্দ্বে ছিলাম \n" +
                "\n" +
                "\n" +
                "diner- (ডিনার) =  রাতের খাবার \n" +
                "\n" +
                "have you diner?- (হ্যাভ ইউ ডিনার?) =  তুমি কি রাতের খাবার খেয়েছ? \n" +
                "\n" +
                "\n" +
                "yeah mom- (ইয়াহ মম) = হ্যাঁ মা \n" +
                "\n" +
                "Ok, now you can go- (ওকে, নাও ইউ ক্যান গো) = ঠিক আছে, এখন তুমি যেতে পার \n" +
                "\n" +
                "\n" +
                "sleep- (স্লিপ) = ঘুমানো\n" +
                "\n" +
                "let's sleep- (লেতট'স স্লিপ) = চল ঘুমাই \n" +
                "\n" +
                "where is my phone?- (হয়ার ইজ মাই ফোন) = আমার ফোন কোথায়? \n" +
                "\n" +
                "\n" +
                "someone- (সামওয়ান) = কেউ একজন \n" +
                "\n" +
                "someone who called you- (সামওয়ান হু কল্ড ইউ) =  কে যেন তোমায় কল দিয়েছিল \n" +
                "\n");
        hashMap.put("title", "১৫তম ক্লাস");
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("english", "১৬ তম দিন \n" +
                "\n" +
                "ex=(এক্স)=সাবেক ।\n" +
                "\n" +
                "girl=(গার্ল)=মেয়ে ।\n" +
                "\n" +
                "friend=(ফ্রেন্ড)=বন্ধু ।\n" +
                "\n" +
                "girl friend=(গার্ল ফ্রেন্ড)=মেয়ে বন্ধু /প্রেমিকা ।\n" +
                "\n" +
                "Oh I see.. she was my ex girl friend=(ও আই ছি... শি ওয়াছ মাই এক্স গার্ল ফ্রেন্ড)=ও আমি দেখতে পাচ্ছি । সে আমার সাবেক মেয়ে বন্ধু ছিল(প্রেমিকা)\n" +
                "\n" +
                "I am call back her=(আই এম কল বেক হার)=আমি তাকে ফেরৎ কল করছি।\n" +
                "\n" +
                "give your mobile=(গিভ ইউর মোবাইল)=তোমার মোবাইল দাও।\n" +
                "\n" +
                "necessary=(নেছেছারি)= প্রয়োজন/দরকারি ।\n" +
                "\t\n" +
                "It is not necessary for you =(ইট ইজ নট নেছেছারি ফর ইউ)=এটা তোমার জন্য আবশ্যক না ।\n" +
                "\n" +
                "are you know that what is necessary or what is not=(আর ইউ নো দেট হোয়াট ইজ নেছেছারি অর হোয়াট ইজ নট?) তুমি কি জান যে, কোনটা প্রয়োজনীয়  আর কোনটা প্রয়োজনীয় না?\n" +
                "\n" +
                "I know well=(আই নো ওয়েল)=আমি ভালভাবেই জানি।\n" +
                "\n" +
                "It's very unnecessary=(ইটস ভেরি আন্নেছেছারি)=এটি খুবই অদরকারী ।\n" +
                "\n" +
                "Don't be angry=(ডন্ট বি এংরি) =রাগ করোনা। \n" +
                "\n" +
                "fun=(ফান)=মজা করা ।\n" +
                "\n" +
                "It was just fun=(ইট ওয়াছ জাস্ট ফান)=এটা আমি মজা করছিলাম।\n" +
                "\n" +
                "drama=(ড্রামা)=নাটক ।\n" +
                "\n" +
                "drama series=(ড্রামা সিরিজ)=নাট্য সিরিয়াল ।\n" +
                "\n" +
                "personally=(পারসোনালি)=ব্যক্তিগতভাবে।\n" +
                "\n" +
                "come here=(কাম হেয়ার)=এখানে আস।\n" +
                "\n" +
                "enough=(এনাফ)= যথেষ্ট\n" +
                "\n");
        hashMap.put("title", "১৬তম ক্লাস");
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("english", "১৭তম দিন\n" +
                "\n" +
                "\n" +
                "\n" +
                "energy=(এনার্জি)=শক্তি ।\n" +
                "\n" +
                "compare=(কম্পেয়ার)=তুলনা করা ।\n" +
                "\n" +
                "commitment=(কমিটমেন্ট)=প্রতিশ্রুতি/অঙ্গিকার ।\n" +
                "\n" +
                "qualification=(কোয়ালিফিকেশন)=যোগ্যতা ।\n" +
                "\n" +
                "go there=(গো দেয়ার)=সেখানে যাও ।\n" +
                "\n" +
                "listen=(লিছেন)=কথা শোনা ।\n" +
                "\n" +
                "stop=(স্টপ)=থেমে যাওয়া/বন্ধকরা ।\n" +
                "\n" +
                "energy=(এনার্জি)=শক্তি ।\n" +
                "\n" +
                "crime=(ক্রাইম)=অপরাধ ।\n" +
                "\n" +
                "criminal=(ক্রিমিনাল)=অপরাধী ।\n" +
                "\n" +
                "Catch it=(কেচ ইট)=এটা ধর ।\n" +
                "\n" +
                "keep it=(কিপ ইট)=এটা রাখ ।\n" +
                "\n" +
                "It was not a girl's number=(ইট ওয়াছ নট এ গার্লস নাম্বার)=এটা কোন মেয়ের নাম্বার ছিলনা।\n" +
                "\n" +
                "this is my friend=(দিস ইজ মাই ফ্রেন্ড)=এটা আমার বন্ধু ।\n" +
                "\n" +
                "answer=(আনসার)=উত্তর ।\n" +
                "\n" +
                "tell me an answer=(টেল মি এন আনসার)=আমায় একটা উত্তর দাও।\n" +
                "\n" +
                "beauty=(বিউটি) =সুন্দর ।\n" +
                "\n" +
                "am I not beautiful?=(আর আই এম নট বিউটি?)=আমি কি সুন্দর নই?\n" +
                "\n" +
                "definitely=(ডেফেনেটলি)=স্পষ্টভাবে।\n" +
                "\n" +
                "definitely not=(ডেফেনেটলি নট)=অবশ্যই না।\n" +
                "\n" +
                "definitely yes=(ডেফেনেটলি ইয়েস)=অবশ্যই হ্যাঁ।\n" +
                "\n");
        hashMap.put("title", "১৭তম ক্লাস");
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("english", "১৮তম দিন\n" +
                "\n" +
                "\n" +
                "\n cute=(কিউট)=মিষ্টি ।\n" +
                "\n" +
                "definitely you are a beauty and cute girl=(ডেফেনেটলি ইউ আর এ বিউটি এন্ড কিউট গার্ল)=নিঃসন্দেহে তুমি সুন্দর ও মিষ্টি একটি মেয়ে।\n" +
                "\n" +
                "sleep=(স্লিপ)=শুয়েপরা/ঘুমানো ।\n" +
                "\n" +
                "wake up=(ওয়েক আপ)=ঘুম থেকে উঠা\n" +
                "\n" +
                "when you will wake up? =(হোয়েন ইউ উইল ওয়েক আপ?) =তুমি কখন ঘুম থেকে উঠবে?\n" +
                "\n" +
                "৪ ০ clock=(এইট ও ক্লক)=আট টা বাজে।\n" +
                "\n" +
                "think=(থিংক)= মনে করা/ভাবা ।\n" +
                "\n" +
                "i think=(আই থিংক) = আমি মনে করি ।\n" +
                "\n" +
                "thinking=(থিংকিং) =ভাবতেছে/চিন্তাকরতেছে ।\n" +
                "\n" +
                "What are you thinking = (হোয়াট আর ইউ থিংকিং?)=তুমি কি ভাবতেছ?\n" +
                "\n" +
                "Nothing but also something something=(নাথিং বাট অলছো সামথিং সামথিং)=কিছু না আবার কিছু কিছু...\n" +
                "\n" +
                "more=(মোর)=আরো ।\n" +
                "\n" +
                "more work=(মোর ওয়ার্ক)=আরো কাজ ।\n" +
                "\n" +
                "I have more work=(আই হেভ মোর ওয়ার্ক)=আমার আরো কাজ আছে।\n" +
                "\n" +
                "tomorrow=(টুমোরু)=আগামী কাল।\n" +
                "\n" +
                "sorry! I have more work tomorrow=(সরি! আই হেভ মোর ওয়ার্ক টুমোরু)=দুঃখিত ! কালকে আমার আরো কিছু কাজ আছে।\n" +
                "\n" +
                "total=(টোটাল)=পুরো /সম্পূর্ণ ।\n" +
                "\n" +
                "total free=(টোটাল ফ্রি)=সম্পূর্ণ ফ্রি ।\n" +
                "\n" +
                "I will total free tomorrow!=(আই এম টুটাল ফ্রি টুমোরু!)= কালকে আমি পুরাপুরি ফ্রি।\n");
        hashMap.put("title", "১৮তম ক্লাস");
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("english", "১৯তম দিন\n" +
                "\n" +
                "\n" +
                "\n" +
                "help=(হেল্প)=সাহায্য করা।\n" +
                "\n" +
                "I will help you=(আই উইল হেল্প ইউ)=আমি তোমায় সাহায্য করবো ।\n" +
                "\n" +
                "no thanks=(নো থ্যাংকস)=না ধন্যবাদ ।\n" +
                "\n" +
                "I don't need any help=(আই ডন্ট নিড এনি হেল্প)=আমার কোনো সাহায্যের দরকার নেই।\n" +
                "\n" +
                "why=(হোয়াই)=কেনো?\n" +
                "\n" +
                "because it's just for me\n" +
                "=(বিকৌজ ইটস জাস্ট ফর মি)=কারন এটা শুধু আমার জন্য।\n" +
                "\n" +
                "I understand it=(আই আন্ডারস্ট্যান্ড ইট)=আমি এটা বুঝতে পারছি।\n" +
                "\n" +
                "matter=(মেটার)=ব্যাপার ।\n" +
                "\n" +
                "top secret=(টপ ছিক্রেট)=অতি গোপনীয় ।\n" +
                "\n" +
                "It's top secret matter=(ইটস টপ ছিক্রেট মেটার) =এটা অতি গোপনীয় ব্যাপার।\n" +
                "\n" +
                "dangerous=(ডেঞ্জেরাস)=বিপজ্জনক ।\n" +
                "\n" +
                "easily=(ইজিলি)=সহজে ।\n" +
                "\n" +
                "recently=(রিছেন্টলি)=সাম্প্রতি/বর্তমানে ।\n" +
                "\n" +
                "till now=(টিল নাউ)=এখন পর্যন্ত ।\n" +
                "\n" +
                "Overlooked = (ওভারলোড)=পরিদর্শন বা দেখাশোনা করা ।\n" +
                "\n" +
                "previous =(প্রিভিয়াছ)=আগের / পূর্বের ।\n" +
                "\n" +
                "previous address=(প্রিভিয়াছ এড্রেস)=আগের ঠিকানা ।\n" +
                "\n" +
                "sufficient=(সাফিছিয়েন্ট)=পর্যাপ্ত পরিমান ।\n" +
                "\n" +
                "insufficient=(ইনসাফিছিয়েন্ট)=অপর্যাপ্ত ।\n" +
                "\n" +
                "increase=(ইনক্রিয়েজ)=বৃদ্ধি পাওয়া ।\n" +
                "\n" +
                "it's increasing day by day=(ইটস ইনক্রিয়েজিং ডে বাই ডে)=এটা দিন দিন বৃদ্ধি পাচ্ছে।\n" +
                "\n");
        hashMap.put("title", "১৯তম ক্লাস");
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("english", "২০তম দিন\n" +
                "\n" +
                "\n" +
                "\n" +
                "it's very unnecessary=(ইটস ভেরি আননেছেছারি) =এটা খুবই অদরকারি ।/যার কোন দরকার নাই।\n" +
                "\n" +
                "you will be happy with me=(ইউ উইল বি হেপি উইথ মি)=তুমি আমার সাথে সুখি হবে।\n" +
                "\n" +
                "will you marry me=(উইল ইউ মেরি মি?)=তুমি কি আমাকে বিয়ে করবে ?\n" +
                "\n" +
                "will you help me=(উইল ইউ হেল্প মি?) =তুমি কি\n" +
                "আমাকে সাহায্য করবে?\n" +
                "\n" +
                "i will help you letter=(আই উইল হেল্প ইউ লেটার)=আমি তোমাকে পরে সাহায্য করবো ।\n" +
                "\n" +
                "will you be my girlfriend? = (উইল ইউ বি মাই গার্লফ্রেন্ড?)=তুমি কি আমার প্রেমিকা হবে ?\n" +
                "\n" +
                "i have a boyfriend=(আই হেভ এ বয়ফ্রেন্ড)=আমার একজন প্রেমিক আছে\n" +
                "\n" +
                "she has boyfriend=(শি হেজ বয়ফ্রেন্ড)=তার প্রেমিক আছে ।\n" +
                "\n" +
                "i will coming soon=(আই উইল কামিং সুন)=আমি দ্রুত আসবো।\n" +
                "\n" +
                "i will go=(আউ উইল গো)=আমি যাব।\n" +
                "\n" +
                "i am coming soon=(আই এম কামিং সুন)=আমি দ্রুত আসছি।\n" +
                "\n" +
                "try=(ট্রাই)=চেষ্টাকরা ।\n" +
                "\n" +
                "i will try=(আই উইল ট্রাই)=আমি চেষ্টা করবো।\n" +
                "\n" +
                "i will try to come=(আই উইল ট্রাই টু কাম)=আমি আসার চেষ্টা করবো।\n" +
                "\n" +
                "cross=(ক্রস)=অতিক্রম/ছারিয়ে যাওয়া ।\n" +
                "\n" +
                "you are crossing your limit=(ইউ আর ক্রছিং ইউর লিমিট)=তুমি তোমার সীমা ছাড়িয়ে যাচ্ছ।\n" +
                "\n" +
                "it's not negative matter = (ইটস নট নেগেটিভ মেটার)= এটা নেতিবাচক বিষয় নয়\n" +
                "\n" +
                "silent=(ছাইলেন্ট)=চুপ থাকা।\n" +
                "\n" +
                "Why you are silent?=(হোয়াই ইউ আর ছাইলেন্ট)=চুপ করে আছ কেনো?\n" +
                "\n");
        hashMap.put("title", "২০তম ক্লাস");
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("english", "২১তম দিন\n" +
                "\n" +
                "\n" +
                "\n" +
                "nothing to say=(নাথিং টু ছে)=কিছুই বলার নাই।\n" +
                "\n" +
                "do you know me=(ডু ইউ নো মি?)=তুমি কি আমাকে চিন?\n" +
                "\n" +
                "i watch it everyday=(আই ওয়াচ ইট এভরিডে)=আমি এটা প্রতিদিন দেখি।\n" +
                "\n" +
                "do you brush your teeth=(ডু ইউ ব্রাশ ইউর টিথ?)=তুমি কি তোমার দাঁত মাজ?\n" +
                "\n" +
                "now i am in bathroom=(নাউ আই এম ইন বাথরুম)=আমি এখন গোসল খানায়।\n" +
                "\n" +
                "bath=(বাথ)=গোসল ।\n" +
                "\n" +
                "expensive=(এক্সপেনছিব)=ব্যায়বহুল ।\n" +
                "\n" +
                "aim=(এইম)=লক্ষ ।\n" +
                "\n" +
                "it's very expensive matter (ইটস ভেরি এক্সপেনছিব মেটার)=এটা খুবই ব্যায়বহুল ব্যাপার।\n" +
                "\n" +
                "life=(লাইফ)=জীবন ।\n" +
                "\n" +
                "aim in life=(এইম ইন লাইফ)=জীবনের লক্ষ ।\n" +
                "\n" +
                "bird=(বার্ড)=পাখি ।\n" +
                "\n" +
                "cow is our domestic animal=(কাউ ইজ আওয়ার ডোমেস্টিক এনিমেল)=গরু আমাদের গৃহ-পালিত পশু।\n" +
                "\n" +
                "here are some birds name=(হেয়ার আর সাম বার্ডস নেম)=এখানে কিছু পাখির নাম দেওয়া আছে ।\n" +
                "\n" +
                "for example=(ফর এক্সাম্পল)=উদাহরন সরূপ ।\n" +
                "\n" +
                "domestic=(ডোমেস্টিক)= স্থানীয়/ গৃহ-পালিত ।\n" +
                "\n" +
                "animal=(এনিমেল)=প্ৰাণী ।\n" +
                "\n" +
                "domestic animal=(ডোমেস্টিক এনিমেল)=গৃহ-পালিত প্রাণী ।\n" +
                "\n" +
                "hen=(হেন)=মুরগী ।\n" +
                "\n" +
                "duck=(ডাক)=হাঁস ।\n");
        hashMap.put("title", "২১তম ক্লাস");
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("english", "২২তম দিন\n" +
                "\n" +
                "\n" +
                "\n" +
                "crow=(ক্রো)=কাক ।\n" +
                "\n" +
                "pigeon=(পিজিওন)=পায়রা ।\n" +
                "\n" +
                "peacock=(পি-কক)=ময়ূর ।\n" +
                "\n" +
                "peahen=(পি-হেন)=ময়ূরী ।\n" +
                "\n" +
                "Cucumber bird=(কাউকাম্বার বার্ড)=কুকিল পাখি ।\n" +
                "\n" +
                "Magpie bird=(মেগপাই বার্ড)=দোয়েল পাখি ।\n" +
                "\n" +
                "our national bird is Magpie=(আওয়ার ন্যাশনাল বার্ড ইজ মেগপাই)=আমাদের জাতীয় পাখি হল দোয়েল।\n" +
                "\n" +
                "Parrot=(পেট)=তোতা পাখি।\n" +
                "\n" +
                "Quail birds=(কোয়েল বার্ড)=কোয়েল পাখি ।\n" +
                "\n" +
                "kingfisher=(কিংফিশার)=মাছরাঙ্গা ।\n" +
                "\n" +
                "it doesn't matter=(ইট ডাজন্ট মেটার)=এটা কোন ব্যাপার না।\n" +
                "\n" +
                "old=(ওল্ড)=পুরাতন/বয়স ।\n" +
                "\n" +
                "old man=(ওল্ড ম্যান)=বয়স্ক লোক ।\n" +
                "\n" +
                "i am nineteen years old =(আই এম নাইনটিন ইয়ারস ওল্ড)=আমার বয়স ঊনিশ বছর।\n" +
                "\n" +
                "new=(নিউ)=নতুন।\n" +
                "\n" +
                "son=(সন)=পুত্র ।\n" +
                "\n" +
                "my son=(মাই সন)=আমার পুত্র ।\n" +
                "\n" +
                "this is my son=(দিস ইজ মাই সন)=এইটা আমা\n" +
                "ছেলে।\n" +
                "\n" +
                "mosquito=(মসকুইটো)=মশা ।\n" +
                "\n" +
                "spider=(স্পাইডার)=মাকড়সা।\n" +
                "\n");
        hashMap.put("title", "২২তম ক্লাস");
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("english", "২৩তম দিন\n" +
                "\n" +
                "\n" +
                "\n" +
                "portico=(পরটিকো)=বারান্দা ।\n" +
                "\n" +
                "window=(উইন্ডো)=জানালা ।\n" +
                "\n" +
                "abolish=(এবোলিশ)=উঠান ।\n" +
                "\n" +
                "ewer=(ইওয়ার)=কলস/বদনা ।\n" +
                "\n" +
                "he is calling me=(হি ইজ কলিং মি)=সে আমাকে ডাকছে ।\n" +
                "\n" +
                "where is your address=(হয়ার ইজ ইউর এড্রেস?)=তোমার ঠিকানা কোথায়?\n" +
                "\n" +
                "flavor = (ফ্লেবার) =সূঘ্রাণ ।\n" +
                "\n" +
                "sweet=(সুইট)=মিষ্টি ।\n" +
                "\n" +
                "sweet flavor=(সুইট ফ্লেবার)=মিষ্টি ঘ্রাণ ।\n" +
                "\n" +
                "marriage proposal=(মেরিজ প্রপোজল)=বিয়ের প্রস্তাব ।\n" +
                "\n" +
                "love proposal=(লাভ প্রপোজল)=ভালবাসার প্রস্তাব।\n" +
                "\n" +
                "i am always with you=(আই এম অলওয়েস উইথ ইউ)=আমি সবসময় তোমার সাথে আছি।\n" +
                "\n" +
                "have you eaten?=(হেভ ইউ ইটেন?)=তুমি খেয়েছ?\n" +
                "\n" +
                "higher=(হাইয়ার)=উচ্চ ।\n" +
                "\n" +
                "educated=(ইডুকেটেড)=শিক্ষিত ।\n" +
                "\n" +
                "person= (পারসন)=ব্যাক্তি ।\n" +
                "\n" +
                "you are heigher educated person=(ইউ আর হায়ার ইডুকেটেড পারসন?)=তুমি উচ্চ শিক্ষিত ব্যাক্তি।\n" +
                "\n" +
                "lower=(লয়ার)=নিম্ন ।\n" +
                "\n" +
                "i am not educated=(আই এম নট ইডুকেটেড)=আমি শিক্ষিত নই।\n" +
                "\n" +
                "but i am lower educated=(বাট আই এম লয়ার ইডুকেটেড)=কিন্তু আমি নিম্ন শিক্ষিত।");
        hashMap.put("title", "২৩তম ক্লাস");
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("english", "২৪ তম দিন \n" +
                "\n" +
                "\n" +
                "\n" +
                "insult=(ইনছাল্ট)=অপমান করা ।\n" +
                "\n" +
                "don't be insult me = ( ডন্ট বি ইনছাল্ট মি)=আমাকে অপমান করবেননা ।\n" +
                "\n" +
                "create=(ক্রিয়েট)=বানানো/সৃষ্টি করা ।\n" +
                "\n" +
                "creator=(ক্রিয়েটর)=স্রষ্ঠা ।\n" +
                "\n" +
                "over=(ওভার)=উপরে/বেশি ।\n" +
                "\n" +
                "over the worlds=(ওভার দা ওয়ার্ল্ড)=সারা বিশ্ব ।\n" +
                "\n" +
                "all=(অল)=সকল ।\n" +
                "\n" +
                "all over the worlds creator is Allah=(অল ওভার দা ওয়ারল্ডস ক্রিয়েটর ইজ আল্লাহ্)=সারা বিশ্বের সৃষ্টিকর্তা মহান আল্লাহ্ ।\n" +
                "\n" +
                "perfect=(পারফেক্ট)=নিখুঁত ।\n" +
                "\n" +
                "decision=(ডিছেশন)=সিদ্ধান্ত ।\n" +
                "\n" +
                "perfect decision=(পারফেক্ট ডিছেশন)=নিখুঁত\n" +
                "সিদ্ধান্ত ।\n" +
                "\n" +
                "month=(মান্থ) =মাস ।\n" +
                "\n" +
                "ago=(এগো)=আগে ।\n" +
                "\n" +
                "four month ago=(ফোর মান্থ এগো)=চার মাস আগে।\n" +
                "\n" +
                "after=(আফটার)=পরে ।\n" +
                "\n" +
                "after four month=(আফটার ফোর মান্থ)=চার মাস\n" +
                "পর।\n" +
                "\n" +
                "I like=(আই লাইক)=আমি পছন্দ করি।\n" +
                "\n" +
                "I like it=(আই লাইক ইট)=আমি এটি পছন্দ করি।\n" +
                "\n" +
                "I like it just for you=(আই লাইক ইট জাস্ট ফর ইউ)=আমি এটা তোমার জন্য পছন্দ করি।\n" +
                "\n" +
                "do you know me?=(ডু ইউ নো মি?)=তুমি কি আমাকে চিন?\n");
        hashMap.put("title", "২৪তম ক্লাস");
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("english", "২৫তম দিন\n" +
                "\n" +
                "\n Hope=(হোপ)=আশা করা ।\n" +
                "\n" +
                "I hope=(আই হোপ) =আমি আশাবাদী ।\n" +
                "\n" +
                "i think=(আই থিংক)=আমি মনেকরি / আমার\n" +
                "মনেহয়।\n" +
                "\n" +
                "i hope you will be success=(আই হোপ ইউ উইল বি সাকসেস)=আমি আশাবাদী তুমি সফল হবে।\n" +
                "\n" +
                "where is your pen?=(হয়ার ইজ ইউর পেন)=তোমার কলম কোথায় ?\n" +
                "\n" +
                "where you are going?=(হয়ার ইউ আর গোয়িং?)=তুমি কোথায় যাচ্ছ?\n" +
                "\n" +
                "think=(থিংক)=মনেকরা ।\n" +
                "\n" +
                "possible=(পছিবল)=সম্ভব ।\n" +
                "\n" +
                "i think it be possible=(আই থিংক ইট বি পছিবল)=আমি মনে করি এটা সম্ভব হবে ।\n" +
                "\n" +
                "remaining=(রিমেইনিং)=বাকী আছে ।\n" +
                "\n" +
                "just one day remaining=(জাস্ট ওয়ান ডে রিমেইনিং)=মাত্র এক দিন বাকী ।\n" +
                "\n" +
                "anything wrong?=(এনিথিং রঙ?)=কোন সমসসা?\n" +
                "\n" +
                "something have wrong = (সামথিং হেভ রং)=অল্পকিছু সমস্যা আছে ।\n" +
                "\n" +
                "how is it possible?= (হাউ ইজ ইট পছিবল?)=এটা কি করে সম্ভব ?\n" +
                "\n" +
                "is it possible=(ইজ ইট পছিবল?)=এটা কি সম্ভব ?\n" +
                "\n" +
                "i hopefully=(আই হোপফুলি)=আমি আশাবাদী ।\n" +
                "\n" +
                "you will be successful in the future- উইল বি সাকসেসফুল ইন দা ফিউচার)=তুমি ভবিষ্যতে\n" +
                "সফল হবে ।\n" +
                "\n" +
                "this is very bad=(দিস ইজ ভেরি বেড)=এইটা খুবই খারাপ।\n" +
                "\n" +
                "Do you know her? (ডু ইউ নো হার?) =তুমি কি তাকে চিন?\n" +
                "\n" +
                "She is my wife. =(শি ইজ মাই ওয়াইফ)=সে আমার স্ত্রী।\n");
        hashMap.put("title", "২৫তম ক্লাস");
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("english", "২৬তম দিন\n" +
                "\n" +
                "\n" +
                "\n" +
                "Do you know him? (ডু ইউ নো হিম?)=তুমি কি তাকে চিন?\n" +
                "\n" +
                "he is my friend=(হি ইজ মাই ফ্রেন্ড)=সে আমার বন্ধু ।\n" +
                "\n" +
                "they are also know=(দে আর অলছো নো)=তারাও জানে ।\n" +
                "\n" +
                "Thief=(থিফ)=চোর ।\n" +
                "\n" +
                "let me finish=(লেট মি ফিনিশ)=আমাকে শেষ করতে দাও।\n" +
                "\n" +
                "finish=(ফিনিশ)=শেষ ।\n" +
                "\n" +
                "let me=(লেট মি)=আমাকে দাও।/আমাকে সুযোগ দাও \n" +
                "\n" +
                "i need a job=(আই নিড এ জব)=আমার একটা কাজ বা চাকরি দরকার।\n" +
                "\n" +
                "get=(গেট)=পাওয়া ।\n" +
                "\n" +
                "get started=(গেট স্টারটেড)=এবার শুরু করা যাক।\n" +
                "\n" +
                "to get=(টু গেট)=পেতে ।\n" +
                "\n" +
                "please=(প্লীজ)=অনুগ্রহ করে / দয়াকরে ।\n" +
                "\n" +
                "try=(ট্রাই)=চেষ্টা করা ।\n" +
                "\n" +
                "understand=(আন্ডারস্ট্যান্ড)=বুঝা ।\n" +
                "\n" +
                "here=(হেয়ার)=এখানে ।\n" +
                "\n" +
                "new=(নিউ)=নতুন ।\n" +
                "\n" +
                "Sorry i am new here=(সরি আই এম নিউ হেয়ার)=দুঃখিত আমি এখানে নতুন।\n" +
                "\n" +
                "mind=(মাইন্ড)=মনেকরা ।\n" +
                "\n" +
                "don't=(ডোন্ট)=করোনা ।\n" +
                "\n" +
                "please don't mind=(প্লীজ ডোন্ট মাইন্ড)=দয়া করে কিছু মনেকরোনা।\n" +
                "\n" +
                "forgive=(ফরগিভ)=ক্ষমা করা।");
        hashMap.put("title", "২৬তম ক্লাস");
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("english", "২৭তম দিন\n" +
                "\n" +
                "\n" +
                "\n" +
                "forgive me please=(ফরগিভ মি প্লিজ)=দয়াকরে আমাকে ক্ষমা কর।\n" +
                "\n" +
                "mistakes= (মিস্টেক)-ভুল ।\n" +
                "\n" +
                "if=(ইফ)=যদি ।\n" +
                "\n" +
                "any=(এনি)=কোন ।\n" +
                "\n" +
                "if have any mistakes=(ইফ হেভ এনি মিস্টেকস)=যদি কোন ভুল থাকে ।\n" +
                "\n" +
                "bird=(বার্ড)=পাখি ।\n" +
                "\n" +
                "fly=(ফ্লাই)=উড়া ।\n" +
                "\n" +
                "butterfly=(বাটারফ্লাই)=প্রজাপতি ।\n" +
                "\n" +
                "flying=(ফ্লাইং)=উড়ছে ।\n" +
                "\n" +
                "sky=(স্কাই)=আকাশ ।\n" +
                "\n" +
                "birds are flying on the sky=(বার্ডস আর ফ্লাইয়িং অন দা স্কাই)=পাখিরা আকাশে উড়ছে।\n" +
                "\n" +
                "ceremony=(ছিরিমনি)=অনুষ্ঠান ।\n" +
                "\n" +
                "marriage ceremony=(মেরিজ ছিরিমনি)=বিবাহের\n" +
                "অনুষ্ঠান ।\n" +
                "\n" +
                "presentation ceremony=(প্রেজেন্টেশন ছিরিমনি)=পুরস্কার বিতরণী অনুষ্ঠান ।\n" +
                "\n" +
                "assembly= (এসেম্বলি)=সমাবেশ ।\n" +
                "\n" +
                "method=(মেথড)=পদ্ধতি ।\n" +
                "\n" +
                "crisis=(ক্রাইসিজ)=অভাব বা সংকট ।\n" +
                "\n" +
                "population=(পপুলেশন)=জনসংখ্যা ।\n" +
                "\n" +
                "popular=(পপুলার)=জনপ্রিয় ।\n" +
                "\n" +
                "very popular=(ভেরি পপুলার)=খুবই জনপ্ৰিয় ।\n" +
                "\n" +
                "environment=(ইনভেরনমেন্ট)= পরিবেশ।\n");
        hashMap.put("title", "২৭তম ক্লাস");
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("english", "২৮তম দিন\n" +
                "\n" +
                "\n" +
                "\n" +
                "pollution=(পলুশন)=দূষণ ।\n" +
                "\n" +
                "it's a very wonderful day=(ইটস এ ভেরি ওয়ান্ডারফুল ডে)=এই দিনটি খুবই সুন্দর ।\n" +
                "\n" +
                "first time=(ফার্স্ট টাইম)= প্রথমবার ।\n" +
                "\n" +
                "it's good=(ইটস গোড)=এটা ভাল ।\n" +
                "\n" +
                "last time=(লাস্ট টাইম)=শেষবার ।\n" +
                "\n" +
                "last warning=(লাস্ট ওয়ারনিং)=শেষ সতর্কবার্তা ।\n" +
                "\n" +
                "final decision=(ফাইনাল ডিসেশন)=শেষ সিদ্ধান্ত ।\n" +
                "\n" +
                "part=(পার্ট)=অংশ ।\n" +
                "\n" +
                "part of this=(পার্ট অফ দিস)=এটার অংশ ।\n" +
                "\n" +
                "hand=(হেন্ড)=হাত ।\n" +
                "\n" +
                "finger=(ফিঙ্গার)=আঙুল ।\n" +
                "\n" +
                "hands finger=(হেন্ডস ফিঙ্গার)=হাতের আঙুল ।\n" +
                "\n" +
                "really=(রিয়েলি)=আসলেই ।\n" +
                "\n" +
                "proud=(প্রাউড)=গর্ভিত ।\n" +
                "\n" +
                "I am really proud of you=(আই এম রিয়েলি প্রাউড অফ ইউ)=আমি তোমার জন্য আসলেই গর্ভিত ।\n" +
                "\n" +
                "don't warry=(ডন্ট ওয়ারি)=টেনশন করোনা ।\n" +
                "\n" +
                "make=(মেইক)=বানানো ।\n" +
                "\n" +
                "i will make it=(আই উইল মেইক ইট)=আমি এটা বানাবো ।\n" +
                "\n" +
                "easy=(ইজি)=সহজ ।\n" +
                "\n" +
                "it's very easy=(ইটস ভেরি ইজি)=এটি খুবই\n" +
                "সহজ।\n");
        hashMap.put("title", "২৮তম ক্লাস");
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("english", "২৯তম দিন\n" +
                "\n" +
                "\n" +
                "\n" +
                "create=(ক্রিয়েট)=বানানো / তৈরি করা ।\n" +
                "\n" +
                "it's very easy to create=(ইটস ভেরি ইজি টু ক্রিয়েট)=এটি বানানো খুবই সহজ ।\n" +
                "\n" +
                "where are you going?=(হয়ার আর ইউ গোয়িং)=তুমি কোথায় যাচ্ছ?\n" +
                "\n" +
                "stay=(স্টে)=অবস্থান করা / দাঁড়াও ।\n" +
                "\n" +
                "please stay here =(প্লীজ স্টে হেয়ার)=দয়া করে এখানে দাঁড়াও ।\n" +
                "\n" +
                "translate=(ট্রান্সলেট)=অনুবাদ ।\n" +
                "\n" +
                "i want to translate=(আই ওয়ান্ট টু ট্রান্সলেট)=আমি অনুবাদ করতে চাই।\n" +
                "\n" +
                "never=(নেভার)=কখনোনা ।\n" +
                "\n" +
                "it's never easy=(ইটস নেভার ইজি)=এটা কোনোভাবেই সহজ নয়।\n" +
                "\n" +
                "wait=(ওয়েট)=অপেক্ষা করা ।\n" +
                "\n" +
                "wait just a minute=(ওয়েট জাস্ট এ মিনিট)=মাত্র এক মিনিট অপেক্ষা কর।\n" +
                "\n" +
                "it's never easy to say=(ইটস নেভার ইজি টু ছে)=এটা বলা কখনো সহজ নয়।\n" +
                "\n" +
                "at first=(এট ফার্স্ট)=প্রথমে।\n" +
                "\n" +
                "for example=(ফর এক্সাম্পল)=উদাহরন স্বরূপ ।\n" +
                "\n" +
                "at first take my salam=(এট ফার্স্ট টেক মাই সালাম)=প্রথমে আমার সালাম নাও।\n" +
                "\n" +
                "difficult=(ডিফিকাল্ট) =কঠিন ।\n" +
                "\n" +
                "Easy to say but difficult to do= (ইজি টু সে বাট ডিফিকাল্ট টু ডু)=বলা সহজ কিন্তু করা কঠিন।\n" +
                "\n" +
                "I'm watching TV=(আই এম ওয়াচিং টিভি)=আমি টিভি দেখছি ।\n" +
                "\n" +
                "Now I'm watching TV=(নাউ আই এম ওয়াচিং টিভি)=এখন আমি টিভি দেখছি।\n");
        hashMap.put("title", "২৯তম ক্লাস");
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("english", "৩০তম দিন\n" +
                "\n" +
                "\n" +
                "\n" +
                "legs finger=(লেগস ফিঙ্গার)=পায়ের আঙুল ।\n" +
                "\n" +
                "hair=(হেয়ার)=চুল ।\n" +
                "\n" +
                "ear=(ইয়ার)=কান ।\n" +
                "\n" +
                "face=(ফেস)=মুখমন্ডল ।\n" +
                "\n" +
                "mouth wash=(মাউথ ওয়াশ)=মুখ ধোয়া ।\n" +
                "\n" +
                "face wash=(ফেস ওয়াশ)=মুখমন্ডল ধোয়া ।\n" +
                "\n" +
                "don't touch me=(ডন্ট টাচ মি)=আমাকে ছুবেনা ।\n" +
                "\n" +
                "write it=(রাইট ইট)=এটা লেখ ।\n" +
                "\n" +
                "right it=(রাইট ইট)=এটা ঠিক I\n" +
                "\n" +
                "do it=(ডো ইট)=এটা কর।\n" +
                "\n" +
                "do it again=(ডো ইট এগেইন)=এইটা আবার কর।\n" +
                "\n" +
                "i am walking on the way= (আই এম ওয়াকিং অন দা ওয়ে)=আমি রাস্তায় হাটছি।\n" +
                "\n" +
                "do you walking=(ডো ইউ ওয়াকিং?)=তুমি কি হাটতেছ?\n" +
                "\n" +
                "yeah Of course=(ইয়াহ অফকোর্স)=হ্যা অবশ্যই ।\n" +
                "\n" +
                "definitely=(ডেফিনেটলি) =নিঃসন্দেহে ।\n" +
                "\n" +
                "impossible=(ইম্পছিবল)=অসম্ভব ।\n" +
                "\n" +
                "prophet=(প্রফেট)=নবী ।\n" +
                "\n" +
                "prophet sm. said=(প্রফেট (সঃ) ছেইড)=নবী (সঃ)\n" +
                "বলেন ।\n" +
                "\n" +
                "God= (গড)=প্রভু ।\n" +
                "\n" +
                "Lord=(লর্ড)=প্রভু ।\n" +
                "\n" +
                "god bless you=(গড ব্লেছ ইউ)=আল্লাহ্ তোমার সহায় হোক।");
        hashMap.put("title", "৩০তম ক্লাস");
        arrayList.add(hashMap);


    }




}