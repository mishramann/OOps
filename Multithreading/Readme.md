Multithreading

---

// CPU - brain of computer
// main functioning come under core
// A core is an individual processing unit within a CPU.
// A program is a set of instuctions written in a programming language that
// tells the computer how to perform a specific task
// process - instance of program
// A thread is the smallest unit of execution within a process. A process can
// have multiple thread, which can share same resources but can run
// independently.
// A web browser like Google chrome might use multiple thread for different
// tabs, with each tabs runing as a seperate thread.
// ex - webbrowser
// Multitasking allows as operating system to run
// Multitasing is the ability of Operating System to execute or to run multiple
// processes simultaneously
// Example
// We are using browsing the internet while listening to music and downloading a
// file.
// Multithrading refers to the ability to execute multiple threads within a
// single process concurrently.

// When web browser use multithreading?
// A web browser can use multithreading by having seperate threads for rendering
// the page, running javascript, and managing user inputs. This make browser
// more responsive and efficient.
// Multithreading enhanse the efficiency of multitasking by breaking down
// individual tasks into smaller sub-tasks or threads. These thread can
// processed simultaniusly

// In a single-core system:
// Both threads and processes are managed by the OS schedueler through time
// slicing and context switchng to create the illusion of simultaneously
// execution.

// In Multi Core system :
// Both threads and processes can run in true parallel on different cores, with
// the OS scheduler distributing tasks across the cores to optimize performance.

// Time Slicing
// Definition: Time slicing devides CPU time into small intervals called time
// slicing or quanta.
// Function: The OS scheduler allocates these time slices to different processes
// and threads,
// ensuring each gets a fair share of CPU time.
// Purpose: This prevents any single process or threads from monopolizing the
// CPU, improving responsiveness and enabling concurrent execution.

// Context Switching
// Definition: Context Switching is the process of saving the state of a
// currently running process or thread and loading the state of the next to be
// executed.
// Function: When process or thread's time slice expires, the OS seheduler
// performs a context switch to move the CPU's focus to another process or
// thread.
// Purpose: This allow multiple processes and threads to share the CPU, giving
// the appearance of simultaneous execution on the single ... or Improving
// parallelism on multi-core CPUS.

//System.out.println(Thread.currentThread().getName()); //for check which thread you are in

When a java program starts, one thread running immediately, which is called the main thread, This thread is responsible for executing the main method of program
to create a new thread in java, you can either extend a thread class or Runnable interface

. A new class World is created that extends Thread.
. The run method is overridden to define the code that constitutes the new thread.
. start method is called to initiate the new thread.
. A new class World is created that implements Runnable.
. A thread object is created by passing an instanceof World.
.start method is called on the Thread objwect to initiate the new thread.

Thread LifeCycle - create hua run hua then terminate hogaya

The LifeCycle of Thread in java consists of several states, Which a thread can move through during its execution

# New - A thread is in this state when it is created but not yet started.

# Runnable - After the start method called, the thread becomes runnable. it's ready to run and is waiting for CPU time.

# Running - the thread is in this state when it is executing.

# Blocked/Waiting - A thread is in the state when it is waiting for a resource or for another Thread to perform an action.

# Terminated - A thread is in this state when it has a finished executing

//start run sleep join setPriority interrupt yield setDaeman

Author - Piyush Mishra
