# MultiTasking
`concurrently`-[run multiple program at same time].or[system can do more than one program]

- process based two or more program concurrently.
- thread based -in one program,tasks concurrently.[ called asjob]

# processes
A process has a self-contained execution environment.[vlc,msoffice]

Multitasking:
Mutliple Processes

Doing many task at same time using different processes
single thread:single task:job

JVM:Single processes
Concurrently

Doing same things at same time inside a single process
Multithreading:Light weighted,
Multithreading is a subset of multitasking.


getBalance()
pay()
buy()
go()

STACK-FIFO

STACK MECHANISM

video games
carton-animation graphics
web servers

A corresponding exception will be thrown
try{

}
catch(Exception e){

}

# Multitasking or multiprocessing                      #multithreading
- processes are heavy weight         - processes are light weight
- separate address spaces            - same address spaces
- costly                             -cheaper


1) by extending thread class
2) by implementing runnable interface

Thread class -->
public void run(),
public void start()

Case 1:
ct.start()  you are started a new thread

Case 2:
ct.run()   -single thread

run() method is overridden from childclass.
 can we have two main method in a same class
 no?

 can we use start two times?
 no
 can we start bike wo times
 no

 java.lang.IllegalThreadStateException-if we start thread two times.

thread has state 

so thread life cycle:
every human has a lifecycle

JVM-->Processor/OS
JVM is platform dependent.

thread Life Cycle:
runnable:
running:
 Developer is moving  anew thread to runnable.

 JVM is moving that thread from runnable to running

inside jvm we have a software called `Thread Scheduler`.who is responsible for moving thread to runnable from running.

# Thread Scheduler:
Decides which Thread to be moved from Runnable to Running.

example is traffic and vehicle running.
we can give priority to the thread

setPriority(int)--1--10

OS:Multitasking

Notepad
chrome
vlc
eclipse

Processor i5
pendrive
antivirus

whatsapp


IllegalArgumentException 
we cannot give other numbers only 1 to 10 is allowded

default thread priority is 5.



-----------------------
1) what is multithreading?
2) what is Thread lifecycle?
3) what is thread priority?
4) how to change thread priority?
5) thread realted exceptions
6) what will happen if i start a thread twice?
-----------------------------------------------------


when the thread is running the cpu gives you times,space,ram,

# yield():
Currently executing thread giving its chances to other threads,
Other thread which have same priority as of yielding thread.

running thread is at which state to go to yields.
running thread.

then the thread goes to runnable thread

[bus example] helping people

[school compatition example]-prize giving


# join():
i am waiting to join other thread.sometiems we have a need.
if a thread wants to wait untill any other thread execution.

oa
public void bringQuestionPapers(){

}
oa.join()
teacher is waiting for oa to join
public void conductExam(){
//waiting for question paper
}

download is waiting for internet connection.
 what happen dayfull the internet is not connected.

 friend waiting for movie ticket for 5 min
 then.

# sleep();

# intruppt
slepping or waiting thread can be intruppted.


500gb -download manager -200gb

wifi -down
wifi up down.intrrupt()

bankng atm money filling


start()
run()
sleep()
join()
intrrupt()

synchronized 

ITC inter thread communication












