#多线程
* A线程 正则执行一个对象中的同步方法,B 线程是否可以同时执行同一个对象中的非同步方法?  可以
* 同上,B 线程是否可以同时执行同一个对象中的另一个同步方法? 可以
* 线程抛出异常会释放锁吗?  会,导致其他线程获取脏数据 数据不一致,使用try catch 回滚,不释放锁
* Volatile 和Synchronized 的区别?
	- 无锁同步,内存可见性 ,禁止重排序,不具备原子性,只需要保证可见性的时候使用可以提高多线程访问的效率,Synchronzed既可以保证可见性 原子性,有点重量级,尽量锁定需要的代码块,锁是在heap里面的new Object上,不要用string常量作为锁对象
	- count++ 不是原子操作,线程不安全
* 写一个程序 ,证明AtomXXX 类比Synchronized更高效
* AtomXXX类 可以保证可见行吗? 写一个程序来证明
* 写一个程序证明atomXXX 类的多个方法并不构成原子性
* 写一个程序模拟死锁 ? 通过线程池实现 ,使用TimeUnit 更好的控制时间
* 写一个程序,在main 线程中启动100个线程,100个线程完成后,主线程打印"完成" 后,使用join() 和CountDownLatch 都可以完成
