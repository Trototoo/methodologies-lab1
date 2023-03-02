**Quadratic equation solver**
=============================

This program is created to solve quadratic equations:

$ax^2+bx+c=0$, where $a \neq 0$.

**How program works**

This program is created with Kotlin, so you will need IntelliJ IDEA to compile it.  

This program has two modes: interactive mode and noninteractive mode. Interactive mode supports user to enter a b c by user. Noninteractive mode uses file to get a b c.

**How to run program**

<u>Interactive mode</u>

You need to open Main.kt and press green triangle with "Current File" mode chosen.

![Interactive mode.png](src%2Fmain%2Fresources%2Fimages%2FInteractive%20mode.png)


<u>Noninteractive mode</u>

You need to change configuration and then press green triangle.

![Noninteractive mode1.png](src%2Fmain%2Fresources%2Fimages%2FNoninteractive%20mode1.png)

![Noninteractive mode2.png](src%2Fmain%2Fresources%2Fimages%2FNoninteractive%20mode2.png)

Add new run configuration for Kotlin.

![Noninteractive mode3.png](src%2Fmain%2Fresources%2Fimages%2FNoninteractive%20mode3.png)

In "Program arguments field" you need to write path to file.

*IMPORTANT!*

It starts not from classes folder but from project folder.

The file must be of a certain format for the program to successfully run it. For example:

`1\s2\s1\n`

\n - newline symbol
\s - whitespace symbol

Examples of program running:

<u>Interactive mode</u>

![example1.png](src%2Fmain%2Fresources%2Fimages%2FExamples%2Fexample1.png)

![example2.png](src%2Fmain%2Fresources%2Fimages%2FExamples%2Fexample2.png)

![example3.png](src%2Fmain%2Fresources%2Fimages%2FExamples%2Fexample3.png)

<u>Noninteractive mode</u>

File pattern: "0\s2\s0\n"

![example4.png](src%2Fmain%2Fresources%2Fimages%2FExamples%2Fexample4.png)

File pattern: "1\s0\s0\n"

![example5.png](src%2Fmain%2Fresources%2Fimages%2FExamples%2Fexample5.png)

File pattern: no file

![example6.png](src%2Fmain%2Fresources%2Fimages%2FExamples%2Fexample6.png)

**Revert-commit link:**

https://github.com/Trototoo/methodologies-lab1/commit/b6e0973978c9ee8eb8aefefa155739908ed4be3b