package constants;

public class Constants {

    public static final int SIZE = 500000000;
    public static final String SHARED_MEMORY_PATH = "/dev/shm/image-cache";
    public static final String HDD_PATH = "/home/uliana/Documents/lgi/docker/benchmarks/results/buffertext.txt";
    public static final String RECEIVED_FILE = "/home/uliana/Documents/lgi/docker/benchmarks/results/received.txt";
    public static final String SEND_FILE = "/home/uliana/Documents/lgi/docker/benchmarks/results/send.txt";
    public static final String NAMED_PIPE = "/home/uliana/Documents/lgi/docker/FILE.in";
    public static final String TCP_HOST = "localhost";
    public static final int TCP_CONSUMER_PORT = 8000;
    public static final int TCP_PRODUCER_PORT = 9000;
    public static final int BLOCK_SIZE = 60_000;
}
