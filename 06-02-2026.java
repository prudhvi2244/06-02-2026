Date : 06-02-2026
***********************
File Handling:
=======================
1)File
2)FileReader
3)FileWriter
4)PrintWriter

5)BufferedReader
6)BufferedWriter

7)FileInputStream
8)FileOutputStream

9)ObjectInputStream
10)ObjectOutputStream

11)transient keyword
12)Serializable Interface

Exception Handling Updates in Java 7 and above

1)As a Java Programmer if we choose Files as Backend Storage, then we have to work with 
java.io package
2)java.io throws checked exceptions, so compulsorily we have to handle exceptions

File Class:
====================
1)We can use File Class to create file object and perform different operations like
creating directory, creating files, reading and writing data to and from files., deleting files
etc

constructors of File class:
====================================
1)public java.io.File(java.lang.String) : Creates File or Directory in current working directory
2)public java.io.File(java.lang.String, java.lang.String) : Creates File or Directory in
Specified Directory
3) public java.io.File(java.io.File, java.lang.String) : 

Important File Class Methods:
====================================
1)public boolean createNewFile() throws java.io.IOException;
2)public boolean mkdir();
3)public boolean exists();
4)public boolean isDirectory();
5)public boolean isFile();
6)public boolean isHidden();
7)public long lastModified();
8)public long length();
9)public boolean delete();
10)public java.lang.String[] list();
11)public boolean mkdirs();


2)FileReader
=====================
1)It is used to read data from the file character by character

constructors of FileReader:
=================================
1)public java.io.FileReader(java.lang.String) throws java.io.FileNotFoundException
2)public java.io.FileReader(java.io.File) throws java.io.FileNotFoundException

FileWriter:
============================
1)It is used to write character data to a file

constructors of FileWriter:
=================================
1)public java.io.FileWriter(java.lang.String) throws java.io.IOException : 
2)public java.io.FileWriter(java.lang.String, boolean) throws java.io.IOException;
3)public java.io.FileWriter(java.io.File) throws java.io.IOException;
4)public java.io.FileWriter(java.io.File, boolean) throws java.io.IOException;


PrintWriter(java.io):
==================================
1)We can use PrintWriter class object to store any type of primitive data,including Strings

constructors of PrintWriter:
===============================
1)public java.io.PrintWriter(java.io.Writer);
2)public java.io.PrintWriter(java.io.Writer, boolean);
3)public java.io.PrintWriter(java.io.File) throws java.io.FileNotFoundException
4)public java.io.PrintWriter(java.lang.String) throws java.io.FileNotFoundException;


5)BufferedReader:
=============================
1)Used to read data from the file
2)Reads Data Line By Line

constructors of BufferedReader:
====================================
1)public java.io.BufferedReader(java.io.Reader, int);
2)public java.io.BufferedReader(java.io.Reader)

Methods of BufferedReader :
======================================
1)public int read() throws java.io.IOException;
2)public java.lang.String readLine() throws java.io.IOException
3)public void close() throws java.io.IOException;

BufferedWriter:
=====================
1)Used to Write character data to a file

constructors of BufferedWriter:
========================================
1)public java.io.BufferedWriter(java.io.Writer);
2)public java.io.BufferedWriter(java.io.Writer, int);

Methods of BufferedWriter:
===============================
1)public void write(int) throws java.io.IOException;
2)public void newLine() throws java.io.IOException;
3)public void flush() throws java.io.IOException;
4)public void close() throws java.io.IOException;

Serialization:
=====================
1)The Process of saving state of an object into a file is called Serialization
2)The Process of converting java object into network/file supported form is called Serialization

=>FileOutputStream
=>ObjectOutputStream

De-Serialization:
=======================
1)The Process of reading object state from the file is called De-Serialization
2)The Process of converting  network/file supported form into java object  is called
 De-Serialization

=>FileInputStream
=>ObjectInputStream

Student => Serializable

=>If we want to Serializable any java object then corresponding class must implement Serializable
Interface
=>Inside Serializable there are no abstract Methods
=>It is a marker Interface


transient keyword:
=========================
1)If we can apply only for variables
2)At the time of Serialization if we don't want to save certain object variables values then
we have to declare such variables with transient keyword.

