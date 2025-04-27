#!/usr/bin/env python
# coding: utf-8

# In[1]:


import pandas as pd


# In[2]:


# code to create the dataset
  
# importing the libraries
import pandas as pd
  
# creating the dictionary
dictionary = {'OUTLOOK': ['Rainy', 'Rainy',
                          'Overcast', 'Sunny',
                          'Sunny', 'Sunny',
                          'Overcast', 'Rainy',
                          'Rainy', 'Sunny',
                          'Rainy', 'Overcast',
                          'Overcast', 'Sunny'],
              'TEMPERATURE': ['Hot', 'Hot', 'Hot',
                              'Mild', 'Cool',
                              'Cool', 'Cool',
                              'Mild', 'Cool',
                              'Mild', 'Mild',
                              'Mild', 'Hot', 'Mild'],
              'HUMIDITY': ['High', 'High', 'High',
                           'High', 'Normal', 'Normal',
                           'Normal', 'High', 'Normal',
                           'Normal', 'Normal', 'High',
                           'Normal', 'High'],
              'WINDY': ['No', 'Yes', 'No', 'No', 'No',
                        'Yes', 'Yes', 'No', 'No',
                        'No', 'Yes', 'Yes', 'No',
                        'Yes']}
  
# converting the dictionary to DataFrame
df = pd.DataFrame(dictionary)
  
display(df)


# In[3]:


# importing the libraries
import pandas as pd

# creating a copy of the original data frame
df3 = df.copy()

# calling the get_dummies method
# the first parameter mentions the
# the name of the data frame to store the
# new data frame in
# the second parameter is the list of
# columns which if not mentioned
# returns the dummies for all
# categorical columns
df3 = pd.get_dummies(df3,
					columns = ['WINDY', 'OUTLOOK'])

display(df3)


# In[4]:


# importing the libraries
from sklearn.preprocessing import LabelBinarizer

# creating a copy of the
# original data frame
df1 = df.copy()

# creating an object
# of the LabelBinarizer
label_binarizer = LabelBinarizer()

# fitting the column
# TEMPERATURE to LabelBinarizer
label_binarizer_output = label_binarizer.fit_transform( df1['TEMPERATURE'])

# creating a data frame from the object
result_df = pd.DataFrame(label_binarizer_output,
						columns = label_binarizer.classes_)

display(result_df)


# In[5]:


pip install category_encoders


# In[6]:


# importing the libraries
import category_encoders as cat_encoder

# creating a copy of the original data frame
df2 = df.copy()

# creating an object BinaryEncoder
# this code calls all columns
# we can specify specific columns as well
encoder = cat_encoder.BinaryEncoder(cols = df2.columns)

# fitting the columns to a data frame
df_category_encoder = encoder.fit_transform( df2 )

display(df_category_encoder)


# In[ ]:




