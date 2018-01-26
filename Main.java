package com.rahul;

public class Main {


    public static void main(String[] args) {

        Block genesisBlock = new Block("This is the first block called as Genesis", "0");
        System.out.println("Hash for block 1 : " + genesisBlock.hash);

        Block secondBlock = new Block("This is the second block",genesisBlock.hash);
        System.out.println("Hash for block 2 : " + secondBlock.hash);

        Block thirdBlock = new Block("Hey I am the third block",secondBlock.hash);
        System.out.println("Hash for block 3 : " + thirdBlock.hash);



    }
}
