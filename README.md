# Console of Mormon
This is a simple text-based create-your-own adventure game based on the Book of Mormon.
This serves as my Book of Mormon Project for REL A 275 in Summer Term of 2022.

## How to run

First you need to install Java 11 on your computer. Download and install the release
for your operating system (Windows, Mac, Linux, etc.):

* [Java download](https://www.oracle.com/java/technologies/javase/jdk11-archive-downloads.html)
* [Another version of Java that works](https://docs.aws.amazon.com/corretto/latest/corretto-11-ug/downloads-list.html)

After installing Java, you need to download the latest release. You can find that on
GitHub on the right sidebar. Download it to any folder.

You should be able to double-click the file to run it, but if you can't, open a terminal
(or command line window in Windows), navigate to the folder where the jar is contained
and run the following:

```
java -jar console-of-mormon.jar
```
Or alternatively, you can run from any folder and provide the path to the jar manually:

```
java -jar /path/to/console-of-mormon.jar
```

## Background

I thought it would be a fun idea to create a simple game as my project for REL A 275.
At first, I was hoping to do something as sophisticated as a simple 2D platformer or
puzzle game, but when I realized how little time the project provided, I decided to
do a simple text-based choose-your-own-adventure game instead. Even after limiting my
scope, however, I was only able to complete a small fraction of what would be a finished
game. But this proof-of-concept was still super fun to make, and I really enjoyed
creating a short narrative revolving around Nephi, trying to imagine what life might have
been like during his time.

## Future plans

I plan on working on this more throughout the next few months. In its current state,
the game is not very maintainable. It'll take a long time to design a solid model
that flows through the decision tree. The one I have now is too statically linked and
easy to completely break. I also don't like that the player has to press enter each
time he/she wants to submit a response. It doesn't seem like Java provides any method
of instantly reading input by default, so I'll have to do some digging.

## Video demo


https://user-images.githubusercontent.com/62630455/182484288-35c02401-668a-4b2b-a452-1fbca71e6758.mov



