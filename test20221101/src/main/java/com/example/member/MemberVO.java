package com.example.member;

public class MemberVO {
    private int memberno;
    private String id = "";
    private String password = "";
    private String nickname = "";

    public int getMemberno(){ return this.memberno; }
    public void setMemberno(int memberno){ this.memberno = memberno; }

    public String getId(){ return this.id; }
    public void setId(String id){ this.id = id; }

    public String getPassword(){ return this.password; }
    public void setPassword(String password){ this.password = password; }

    public String getNickname(){ return this.nickname; }
    public void setNickname(String nickname){ this.nickname = nickname; }
}
