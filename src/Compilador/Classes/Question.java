package Classes;

public abstract class Question implements QuestionBase{
        private Result result;
        private String id;

        public Question(Result result, String id) {
            this.result = result;
            this.id = id;
        }

        public String getID(){
            return this.id;
        }

        public Result getResult() {
            return this.result;
        }

        abstract String getQuestion();

        abstract String getAnswer();
}