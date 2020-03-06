class Reverse {
	public static void main(String[] args) {
		int n=1;
		for(int i=1;i<=4;i++) {
			if(i%2!=0) {
				for(int j=n;j<=n+3;j++) {
					System.out.print(j+" ");
				}
			}
			else {
				for(int j=n+3;j>=n;j--) {
					System.out.print(j+" ");
				}
			}
			System.out.println(" ");
			n=n+4;
		}
	}
}
