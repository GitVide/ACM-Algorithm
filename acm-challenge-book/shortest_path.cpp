/*
tag:广度优先搜索、队列
这道题目以及解法均来自《挑战程序设计竞赛（第2版）》第34页-36页。
输入:
10 10
#S######.#
......#..#
.#.##.##.#
.#........
##.##.####
....#....#
.#######.#
....#.....
.####.###.
....#...G#
*/
#include<iostream>
#include<utility>
#include<queue> 
#define MAX_N 105
#define MAX_M 105
using namespace std; 
const int INF = 100000000;
typedef pair<int,int> P;
char maze[MAX_N][MAX_M+1];
int n,m;
int distanc[MAX_N][MAX_N];
int dx[4]={-1,0,1,0},dy[4]={0,1,0,-1};


int bfs(int sx,int sy,int gx,int gy)
{
	for(int i=0;i<n;i++)
		for(int j=0;j<m;j++)
			distanc[i][j]=INF;
	queue<P> que;
	que.push(P(sx,sy));
	distanc[sx][sy]=0;
	while(que.size())
	{
		P p=que.front();
		que.pop();
		if(p.first==gx&&p.second==gy) break;
		for(int i=0;i<4;i++)
		{
			int nx=p.first+dx[i];
			int my=p.second+dy[i];
			if(nx>=0&&nx<n&&my>=0&&my<m&&maze[nx][my]!='#'&&distanc[nx][my]==INF)
			{
				distanc[nx][my]=distanc[p.first][p.second]+1;
				que.push(P(nx,my));
			}
		}
	}
	return distanc[gx][gy];
}
int main()
{
	cin>>n>>m;
	for(int i = 0;i<n;i++)
		for(int j = 0;j<m;j++)
			cin>>maze[i][j];
	int sx,sy,gx,gy;
	for(int i=0;i<n;i++)
	{
		for(int j = 0;j<m;j++)
		{
			if(maze[i][j]=='S')
			{
				sx=i;
				sy=j;
			}
			if(maze[i][j]=='G') 
			{
				gx=i;
				gy=j;
			}
		}
	}
	int anwser = bfs(sx,sy,gx,gy);
	cout<<anwser<<endl;
	return 0;
}

