
public class File extends AbstractFile {
	private int size ;
	
	public File( String name, int size) { 
		super(name);
		this.size = size ;
	} 
	public int getSize() { return size ; }
	public void print() {
		for ( int i = 0 ; i < getDepth() ; i ++ )
			System.out.print("\t") ;
		System.out.println("[File] " + getName() + ", Size: " + size) ;	
	}
	@Override
	public void description() {
		System.out.println(getName() + "속성");
		System.out.println("파일 형식 :"+ getName());
		System.out.println("연결프로그램: 선택");
		System.out.println("크기: "+ getSize());
		System.out.println("위치: "+ getLocation());
	}
	public String getLocation(){
		return getName();
		// return this.getParentsFile().getLocation();
	}
}