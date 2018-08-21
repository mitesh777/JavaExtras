
public class Question {
private int id;
private String questionText;
private String levelOfDifficulty;
private int mark;
public int getMark() {
	return mark;
}
public void setMark(int mark) {
	this.mark = mark;
}
private Topic topic;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getQuestionText() {
	return questionText;
}
public void setQuestionText(String questionText) {
	this.questionText = questionText;
}
public String getLevelOfDifficulty() {
	return levelOfDifficulty;
}
public void setLevelOfDifficulty(String levelOfDifficulty) {
	this.levelOfDifficulty = levelOfDifficulty;
}
public Topic getTopic() {
	return topic;
}
public void setTopic(Topic topic) {
	this.topic = topic;
	topic.add(this);
}
public Question(int id, String questionText, String levelOfDifficulty, Topic topic) {
	super();
	this.id = id;
	this.questionText = questionText;
	this.levelOfDifficulty = levelOfDifficulty;
	this.topic = topic;
	topic.add(this);
}

}
