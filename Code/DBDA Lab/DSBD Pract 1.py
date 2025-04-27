#!/usr/bin/env python
# coding: utf-8

# In[1]:


import numpy as np
import matplotlib.pyplot as plt
import pandas as pd


# In[2]:


df=pd.read_csv("Downloads\DSBD PRACT\dirtydata.csv")#LOAD CSV FILE


# In[14]:


print(df)


# In[4]:


data={
    "Roll no":[1,2,3],
    "Mraks":[50,40,45]
}
dataset=pd.DataFrame(data)
print(dataset)


# In[5]:


print(dataset.loc[2])


# In[6]:


print(dataset.loc[[0,2]])


# In[7]:


dataset=pd.DataFrame(data,index=["ABC","PQR","XYZ"])


# In[8]:


print(dataset)


# In[9]:


print(dataset.loc["XYZ"])


# In[10]:


df.head()


# In[11]:


df.tail()


# In[12]:


print(df.info())


# In[13]:


df


# In[29]:


print(df)


# In[15]:


df.head(50)


# In[25]:


#print(df.dropna(inplace=True))


# In[18]:


df


# In[33]:


#df.fillna(150,inplace=True)
print(df)


# In[40]:


x=df["Calories"].fillna(130,inplace=True)
print(x)


# In[41]:


x=df["Calories"].mean()
df.fillna(x,inplace=True)
print(df)


# In[43]:


df


# In[45]:


#df["Date"]=pd.to_dateTime(df["Date"])


# In[50]:


df.dropna(subset=["Date"],inplace=True) #inplace will make changes in orginal dataset
print(df)


# In[51]:


df.loc[7,'Duration']=45
print(df)


# In[54]:


print(df.duplicated())


# In[61]:


for x in df.index:
    if df.loc[x,'Duration']>120:
        df.loc[x,'Duration']=120
        print(df)


# In[62]:


#data preprocessing
df.isna().sum()


# In[3]:


df.dropna(axis=1)


# In[67]:


df.dtypes  #returns the datatypes used in dataset


# In[72]:


dataset=pd.DataFrame(data,index=["ABC","PQR","XYZ"])
dataset.size#size of dataframe


# In[69]:


dataset.shape #shape of the dataframe


# In[71]:


dataset.ndim # dimension of the dataframe


# In[86]:


data1={
    'Name':['Rohan','Riya','Teena','Reena'],
    'Roll No':['1','2','3',np.nan],
    'Maths':['50','85',np.nan,'98'],
    'Science':['96','45','89',np.nan],
    'English':['76','78','98','55']
}


# In[87]:


df=pd.DataFrame(data1)
print(df)


# In[75]:


print(df.count()) #give the count of non null values 


# In[76]:


print(df.count(axis='columns'))# count row wise


# In[78]:


df2=df.set_index(['Maths','Science']).count(level='Maths')# will print level wise i.e maths 
print(df2)


# In[79]:


df2=df.set_index(['Maths','Science'])#set the maths and science as index
print(df2)


# In[91]:


df.info()


# In[92]:


print(df.dtypes) #datatypes of all columns


# In[93]:


print(df.columns) #will print columns of the dataset


# In[94]:


#create the index
index_row=['1','2','3','4']
#set the index
df.index=index_row
#print
print(df)


# In[5]:


#data normalization
import pandas as pd

#create data
df=pd.DataFrame([
    [180000,110,18.9,1400],
    [350000,900,15.8,2000],
    [120000,850,10.5,1000],
    [250000,500,9.6,25000]],
    columns=['A','B','C','D'])
#VIEW DATA
display(df)


# In[6]:


import matplotlib.pyplot as plt
df.plot(kind='bar')


# In[7]:


#COPY OF THE DATA
df_max_scaled=df.copy()


# In[8]:


#normalization technique
for column in df_max_scaled.columns:
    df_max_scaled[column]=df_max_scaled[column]/df_max_scaled[column].abs().max()
    
#view normalized form
display(df_max_scaled)


# In[9]:


import matplotlib.pyplot as plt
df_max_scaled.plot(kind='bar')


# In[10]:


# copy the data
df_min_max_scaled = df.copy()

# apply normalization techniques
for column in df_min_max_scaled.columns:
	df_min_max_scaled[column] = (df_min_max_scaled[column] - df_min_max_scaled[column].min()) / (df_min_max_scaled[column].max() - df_min_max_scaled[column].min())	

# view normalized data
print(df_min_max_scaled)


# In[11]:


import matplotlib.pyplot as plt
df_min_max_scaled.plot(kind = 'bar')


# In[12]:


#z score normalization
# copy the data
df_z_scaled = df.copy()

# apply normalization techniques
for column in df_z_scaled.columns:
	df_z_scaled[column] = (df_z_scaled[column] -
						df_z_scaled[column].mean()) / df_z_scaled[column].std()	

# view normalized data
display(df_z_scaled)


# In[13]:


import matplotlib.pyplot as plt
df_z_scaled.plot(kind='bar')


# In[3]:


#data type conversion
d = {'col1': [1, 2], 'col2': [3, 4]}
df = pd.DataFrame(d)
df.dtypes


# In[4]:


df.astype('int32').dtypes


# In[5]:


df.astype({'col1': 'int32'}).dtypes


# In[6]:


ser = pd.Series([1, 2], dtype='int32')
ser


# In[7]:


ser.astype('int64')


# In[8]:


ser.astype('category') #convert to categorical  type


# In[9]:


from pandas.api.types import CategoricalDtype #Convert to ordered categorical type with custom ordering:
cat_dtype = CategoricalDtype(
    categories=[2, 1], ordered=True)
ser.astype(cat_dtype)


# In[10]:


s1 = pd.Series([1, 2])
s2 = s1.astype('int64', copy=False)
s2[0] = 10
s1  # note that s1[0] has changed too


# In[11]:


ser_date = pd.Series(pd.date_range('20200101', periods=3)) #create series of data
ser_date


# In[ ]:


#DATA TYPES CONVERSION


# In[36]:


import numpy as np
import matplotlib.pyplot as plt
import pandas as pd


# In[37]:


df=pd.read_csv("Downloads\DSBD PRACT\sales_data_types.csv")


# In[38]:


print(df)


# In[39]:


df.dtypes


# In[40]:


df['2016']+df['2017']


# In[44]:


df['Customer Number'].astype('int64')#temporary it will change


# In[42]:


df.dtypes


# In[47]:


df["Customer Number"]=df['Customer Number'].astype('int64') #will make permanent changes
df.dtypes


# In[46]:


df.dtypes


# In[49]:


df["2016"]=df['2016'].astype('int') #will make permanent changes
df.dtypes


# In[50]:


df["Active"]=df['Active'].astype('bool') #will make permanent changes
df.dtypes


# In[51]:


df["Jan Units"]=df['Jan Units'].astype('int64') #will make permanent changes
df.dtypes


# In[56]:


def convert_currency(val):
    new_val=val.replace(',','').replace('$','')
    return float(new_val)


# In[57]:


df['2016'].apply(convert_currency)


# In[ ]:




