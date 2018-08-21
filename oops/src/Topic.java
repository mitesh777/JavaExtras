
public class Topic {
private int id;
	private String name;
	private int questionNum;
	private Question[] questions=new Question[10];
public Topic(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		
	}
public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuestionNum() {
		return questionNum;
	}

	public Question[] getQuestions() {
		return questions;
	}


public void add(Question question)
{questions[questionNum]=question;
	questionNum++;
}
}
