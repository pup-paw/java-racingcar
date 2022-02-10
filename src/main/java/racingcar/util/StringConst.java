package racingcar.util;

public enum StringConst {
	INPUT_CAR_NAME_MESSAGE("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분)."),
	DELIMITER(","),
	INPUT_TURN_MESSAGE("시도할 회수는 몇회인가요?"),
	OUTPUT_DELIMITER(" : "),
	POSITION_DELEIMIER("-");


	private final String value;

	StringConst(String value) {
		this.value = value;
	}

	public String getValue() {
		return this.value;
	}
}
