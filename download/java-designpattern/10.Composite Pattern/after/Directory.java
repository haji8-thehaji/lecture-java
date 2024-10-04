
import java.util.ArrayList;
import java.util.List;

public class Directory extends AbstractFile {
	private List<AbstractFile> files = new ArrayList<AbstractFile>();

	public Directory( String name) { super(name) ; } 
	public void addEntry(AbstractFile entry) {
		entry.setDepth(getDepth()+1) ;
		entry.setParentsFile(this);
		files.add(entry) ;	
	}
	public void removeEntry(AbstractFile entry) {
		files.remove(entry) ;
		entry.setParentsFile(null);
	}
	public int getSize() {
		int totalSize = 0 ;
		for (AbstractFile entry: files) totalSize += entry.getSize();
		return totalSize;
	}
	public void print() {
		for ( int i = 0 ; i < getDepth() ; i ++ )
			System.out.print("\t") ;
		System.out.println("[Directory] " + getName() + ", Size: " + getSize()) ;	
		for ( AbstractFile entry: files ) entry.print() ;
	}
	@Override
	public void description() {
		System.out.println(getName() + "속성");
		System.out.println("크기: "+ getSize());
		System.out.println("위치: "+ "c:/");
		System.out.println("내용: "+ getFilesInfo());
	}
	public String getFilesInfo(){
		int directoryCount = 0;
		int fileCount = 0;
		
		for ( AbstractFile entry: files ) {
			if (entry instanceof Directory) {
				directoryCount=directoryCount+1 ;
			}
			else if (entry instanceof File) {
				fileCount=fileCount+1 ;
			}
		}
		return "파일 " + fileCount + ", 폴더 " +directoryCount;
	
	}
}
