package ml.tdtips.cannon;

import java.io.IOException;
import ml.tdtips.cannon.Mom;
import ml.tdtips.cannon.Dad;
import ml.tdtips.cannon.Redbelt;
import java.util.Scanner;
import ml.tdtips.cannon.Elyse;
import ml.tdtips.cannon.Cat;

public class main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc;
		// TODO Auto-generated method stub
		System.out.println("Hi! I'm Tyler!");
		System.out.println("I like to program.");
		sc=new Scanner(System.in);sc.nextLine();
        System.out.println("I love videogames, and building stuff.");
        System.out.println("I love to play minecraft, and for anyone that wants to know, NO I did not come to minecraft just recently. I bought the game in 2016. PC Edition.");
        sc.nextLine();
        System.out.println("I have been doing martial arts since age 4. I am ten now.");
        System.out.println("I am going to get my black belt later this month!");
        sc.nextLine();
        try {
			Redbelt.show();
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
        sc.nextLine();
        System.out.println("Back to the programming thing, I have made a lot of useful programs, (like the one I wrote to make this video)...");
        sc.nextLine();
        System.out.println("...aaand a LOT of useless ones, but that is how I learn :).");
        System.out.println("One of those will automatically order you pizza. And have it delivered.");
        sc.nextLine();
        System.out.println("I also enjoy animating, making videogames, and making music.");
        sc.nextLine();
        System.out.println("I have one sister.");
        sc.nextLine();
        System.out.println("Here is a picture of Elyse The Sister.");
        try {
			Elyse.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        sc.nextLine();
        System.out.println("My dad is a commercial real estate broker. He owns his own business. Here is a picture of me with my dad.");
        sc.nextLine();
        try {
			Dad.show();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        sc.nextLine();
        System.out.println("My mom is a family doctor. Here is a picture of the two of us.");
        sc.nextLine();
        try {
			Mom.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println("We also have a cat who is (in my opinion) the cutest and best kitty cat in the world.");
        sc.nextLine();
        try {
			Cat.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        sc.nextLine();
        System.out.println("I am new to Cannon School.");
        sc.nextLine();
        System.out.println("I am nervous about moving schools. Everything is different.");
        System.out.println("I am VERY excited about the Think Tank.");
        System.out.println("I may need some help with writing, as I am not very good in that area. However, I am great at math.");
        System.out.println("One thing you should know about me is that I am a very independent person. I like to work in groups, but get above 5-6 people and I get too stressed.");
        sc.nextLine();
        System.out.println("Someday I hope to become an airline pilot or a programmer, something with technology.");
        System.out.println("My favorite thing about technology is the fact that after a few minutes of work, you can do nearly anything.");
        sc.nextLine();
        System.out.println("I have made a lot of programs that do many things.");
        sc.nextLine();
        System.out.println("Even order pizza.");
	}

}
