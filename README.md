# SpeakUsingFreeTTS
we will make out program speak, from our input(String or file)

how to setup

1.	Download freeTTS libraries and include them in my Java project in eclipse.
Use this link: http://sourceforge.net/projects/freetts/files/FreeTTS/FreeTTS%201.2.2/freetts-1.2.2-bin.zip/download

2.	When you unzip go to libraries folder and add all jars into build path of project.
3.	Download mbr301d.zip, extract it in a folder named mbrola within my project
Use this link: http://tcts.fpms.ac.be/synthesis/mbrola/bin/pcdos/mbr301d.zip

4.	Download mbrola database for us1, us2, us3 and en1 from http://www.tcts.fpms.ac.be/synthesis/mbrola/mbrcopybin.html

5.	goto 2) Getting the MBROLA Voices section and select the language you want

6.	extract the voice DB zips downloaded in previous step directly in mbrola folder - don't change names of the folders.

7.	include following code pieces to use it:

read instruction.docx for more details or goto https://stackoverflow.com/questions/26236562/mbrola-voices-with-freetts-windows

