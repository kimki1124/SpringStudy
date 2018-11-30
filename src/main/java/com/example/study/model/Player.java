package com.example.study.model;

public class Player {
    // 선수고유번호
    private String id;
    // 이름
    private String name;
    // 생년월일(YYYYMMDD)
    private String birth;
    // 키
    private int height;
    // 몸무게
    private int weight;
    // 신입 계약금
    private int initDeposit;
    // 현재 계약금
    private int currDeposit;
    // 등번호
    private int backNumber;
    // 포지션
    private int position;
    // 연봉
    private int annualIncome;
    // 입단 년도
    private int joinYear;
    // 소속팀
    private String teamName;

    // 컨텍
    private int contact;
    // 파워
    private int power;
    // 선구
    private int battingEye;
    // 주루
    private int baseRunning;
    // 수비
    private int defense;
    // 송구
    private int throwing;

    // 제구
    private int control;
    // 변화
    private int breaking;
    // 구위
    private int ballPower;
    // 구속
    private int ballSpeed;
    // 체력
    private int health;
    // 정신
    private int mental;
    // 회복
    private int recovery;

    public Player(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getInitDeposit() {
        return initDeposit;
    }

    public void setInitDeposit(int initDeposit) {
        this.initDeposit = initDeposit;
    }

    public int getCurrDeposit() {
        return currDeposit;
    }

    public void setCurrDeposit(int currDeposit) {
        this.currDeposit = currDeposit;
    }

    public int getBackNumber() {
        return backNumber;
    }

    public void setBackNumber(int backNumber) {
        this.backNumber = backNumber;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getAnnualIncome() {
        return annualIncome;
    }

    public void setAnnualIncome(int annualIncome) {
        this.annualIncome = annualIncome;
    }

    public int getJoinYear() {
        return joinYear;
    }

    public void setJoinYear(int joinYear) {
        this.joinYear = joinYear;
    }

    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getBattingEye() {
        return battingEye;
    }

    public void setBattingEye(int battingEye) {
        this.battingEye = battingEye;
    }

    public int getBaseRunning() {
        return baseRunning;
    }

    public void setBaseRunning(int baseRunning) {
        this.baseRunning = baseRunning;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getThrowing() {
        return throwing;
    }

    public void setThrowing(int throwing) {
        this.throwing = throwing;
    }

    public int getControl() {
        return control;
    }

    public void setControl(int control) {
        this.control = control;
    }

    public int getBreaking() {
        return breaking;
    }

    public void setBreaking(int breaking) {
        this.breaking = breaking;
    }

    public int getBallPower() {
        return ballPower;
    }

    public void setBallPower(int ballPower) {
        this.ballPower = ballPower;
    }

    public int getBallSpeed() {
        return ballSpeed;
    }

    public void setBallSpeed(int ballSpeed) {
        this.ballSpeed = ballSpeed;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMental() {
        return mental;
    }

    public void setMental(int mental) {
        this.mental = mental;
    }

    public int getRecovery() {
        return recovery;
    }

    public void setRecovery(int recovery) {
        this.recovery = recovery;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
}
