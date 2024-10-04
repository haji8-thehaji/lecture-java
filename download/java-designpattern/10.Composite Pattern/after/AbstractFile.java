
public abstract class AbstractFile {

	private AbstractFile parentsFile ;
	private String name ;
	private int depth = 0 ;
	
	public AbstractFile(String name) {
		this.name = name ; 
	}
	public void setParentsFile(AbstractFile parentsFile){
		this.parentsFile = parentsFile;
	}
	public AbstractFile getParentsFile(){
		return parentsFile;
	}
	public String getName() { return name; }
	public void setDepth(int depth) { this.depth = depth ; }
	public int getDepth() { return depth ; }

	public abstract int getSize() ;
	public abstract void print() ;
	public abstract void description();
}
