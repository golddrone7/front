<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String news[]={
			"'이재명 체포동의안' 무기명 표결 시작",
			"김기현 '불법으로 1천800배 시세차익 얻었다면 즉시 정계 떠나겠다'…'울산땅 시세차익 의혹' 수사 의뢰",
			"이재명 체포동의안 국회 본회의 상정...여야 표결 돌입",
			"설악산에 새 케이블카 들어선다.. 환경평가 '조건부'통과",
			"김의장, '양곡관리법' 합의처리 촉구...'여야 한발씩 양보해달라'",
			"공정위, 통신 3사 은행권 담합 정조준...현장 조사 전격 착수",
			"학폭 징계도 학생부도 '수능 100%' 전형엔 유명무실",
			"카카오 '모든 수단 강구하겠다'…SM엔터 대항 공개매수 시사",
			"윤희근 '국수본부장 사태 안타까워…후임 인선 신속히'",
			"문체부·반크, 함께 손잡고 'K-컬처·K-역사 바로 알리기' 나선다"
	};
%>

<%
	int num=(int)(Math.random()*10);
%>
{
	"news":"<%=news[num] %>"
}